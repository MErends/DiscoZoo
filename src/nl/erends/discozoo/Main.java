package nl.erends.discozoo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import nl.erends.discozoo.animal.Animal;

import java.util.List;


public class Main extends Application {
    
    Game game = new Game();
    
    ComboBox<String> areaComboBox = new ComboBox<>(FXCollections.observableArrayList("Farm", "Outback", "Savanna"));
    
    ClickTile[][] grid = new ClickTile[5][5];
    CheckBox[] animals = new CheckBox[7];

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        primaryStage.setScene(new Scene(root, 1366, 768));
        
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                ClickTile clickTile = new ClickTile(x, y);
                clickTile.setLayoutX(600f + 110 * x);
                clickTile.setLayoutY(150f + 110 * y);
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

    public void refreshGrid() {
        game = new Game();
        for (CheckBox checkBox : animals) {
            if (checkBox.isSelected()) {
                game.addAnimal(Animal.getAnimal(checkBox.getText()));
            }
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
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                ClickTile tile = grid[y][x];
                if (tile.getTile() == null) {
                    highestValue = Math.max(highestValue, game.heatmap[y][x]);
                    tile.setText(Integer.toString(game.heatmap[y][x]));
                    tile.setOnContextMenuRequested(e -> createContextMenu().show(tile, e.getScreenX(), e.getScreenY()));
                }
            }
        }

        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                ClickTile tile = grid[y][x];
                if (tile.getTile() == null && tile.getText().equals(Integer.toString(highestValue))) {
                    tile.setColor(Color.LIGHTPINK);
                }
            }
        }
    }
    
    private void handleAreaChange() {
        String selectedArea = areaComboBox.getValue();
        List<String> animalsStrings = Animal.getAnimals(selectedArea);
        for (int i = 0; i < 7; i++) {
            animals[i].setText(animalsStrings.get(i));
            animals[i].setSelected(false);
        }
    }

    private void handleTileClick(ActionEvent event) {
        MenuItem mi = (MenuItem) event.getSource();
        ClickTile clickTile = (ClickTile) mi.getParentPopup().getOwnerNode();
        clickTile.setText(mi.getText().substring(0, 1));
        clickTile.setTile(Tile.valueOf(mi.getText().toUpperCase()));
        refreshGrid();
    }

    private ContextMenu createContextMenu() {
        ContextMenu contextMenu = new ContextMenu();
        for (CheckBox cb : animals) {
            if (cb.isSelected()) {
                MenuItem menuItem = new MenuItem(cb.getText());
                menuItem.setOnAction(this::handleTileClick);
                contextMenu.getItems().add(menuItem);
            }
        }
        contextMenu.getItems().add(new SeparatorMenuItem());

        MenuItem menuItem = new MenuItem("Empty");
        menuItem.setOnAction(this::handleTileClick);
        contextMenu.getItems().add(menuItem);
        return contextMenu;
    }
}
