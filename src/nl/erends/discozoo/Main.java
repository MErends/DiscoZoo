package nl.erends.discozoo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import nl.erends.discozoo.animal.Animal;

import java.util.List;

public class Main extends Application {
    
    static Game game = new Game();
    
    static ComboBox<String> areaComboBox = new ComboBox<>(FXCollections.observableArrayList("Farm", "Outback", "Savanna", "Northern", "Polar", "Jungle", "Jurassic", "Ice Age", "City", "Mountain", "Moon", "Mars"));
    static ComboBox<String> petComboBox = new ComboBox<>(FXCollections.observableArrayList("-", "PetTurtle", "Cat", "Dog", "PetRabbit", "Lizard"));
    static ClickTile[][] grid = new ClickTile[5][5];
    static CheckBox[] animals = new CheckBox[7];

    static Text stateCount = new Text();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        primaryStage.setScene(new Scene(root, 768, 768));
        
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                ClickTile clickTile = new ClickTile(x, y);
                clickTile.setLayoutX(220f + 110 * x);
                clickTile.setLayoutY(130f + 110 * y);
                grid[y][x] = clickTile;
                root.getChildren().add(clickTile);
            }
        }
        
        for (int x = 0; x < 7; x++) {
            CheckBox checkBox = new CheckBox();
            checkBox.setLayoutX(100);
            checkBox.setLayoutY(180f + 40 * x);
            animals[x] = checkBox;
            checkBox.setOnAction(e -> resetGrid());
            root.getChildren().add(checkBox);
        }
        areaComboBox.setLayoutX(100);
        areaComboBox.setLayoutY(100);
        areaComboBox.setOnAction(e -> this.handleAreaChange());
        root.getChildren().add(areaComboBox);

        petComboBox.setLayoutX(100);
        petComboBox.setLayoutY(450);
        petComboBox.setOnAction(e  -> resetGrid());
        root.getChildren().add(petComboBox);

        stateCount.setLayoutX(150);
        stateCount.setLayoutY(150);
        root.getChildren().add(stateCount);
        primaryStage.show();
    }

    public void resetGrid() {
        for (ClickTile[] row : grid) {
            for (ClickTile ct : row) {
                ct.setTile(null);
            }
        }
        refreshGrid();
    }

    public static void refreshGrid() {
        game = new Game();
        for (CheckBox checkBox : animals) {
            if (checkBox.isSelected()) {
                game.addAnimal(Animal.getAnimal(checkBox.getText()));
            }
        }
        if (petComboBox.getValue() != null && !petComboBox.getValue().equals("-")) {
            game.addAnimal(Animal.getPet(petComboBox.getValue()));
        }

        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                ClickTile tile = grid[y][x];
                tile.setColor(Color.WHITE);
                game.setCurrentFieldTile(x, y, tile.getTile());
            }
        }
        game.checkWanted();
        game.calcuateHeatMap();
        int highestValue = Integer.MIN_VALUE;
        int mostAnimals = Integer.MIN_VALUE;
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                ClickTile tile = grid[y][x];
                if (tile.getTile() == null) {
                    if (game.possibleAnmalsMap[y][x].size() > mostAnimals) {
                        highestValue = game.heatmap[y][x];
                        mostAnimals = game.possibleAnmalsMap[y][x].size();
                    } else if (game.possibleAnmalsMap[y][x].size() == mostAnimals) {
                        highestValue = Math.max(highestValue, game.heatmap[y][x]);
                    }
                    tile.setText(Integer.toString(game.heatmap[y][x]));
                    tile.buildContextMenu();
                }
            }
        }

        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                ClickTile tile = grid[y][x];
                if (tile.getTile() == null && tile.getText().equals(Integer.toString(highestValue)) && game.possibleAnmalsMap[y][x].size() == mostAnimals) {
                    tile.setColor(Color.LIGHTPINK);
                }
            }
        }
        stateCount.setText(Integer.toString(game.possibleFields.size()));
    }
    
    private void handleAreaChange() {
        String selectedArea = areaComboBox.getValue();
        List<String> animalsStrings = Animal.getAnimals(selectedArea);
        for (int i = 0; i < 7; i++) {
            animals[i].setText(animalsStrings.get(i));
            animals[i].setSelected(false);
        }
        resetGrid();
    }
}
