package nl.erends.discozoo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
    
    Game game = new Game();
    
    ComboBox<String> area = new ComboBox<>(FXCollections.observableArrayList("Farm", "Outback"));
    
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



                clickTile.setOnMouseClicked(event -> System.out.println(((ClickTile)event.getSource()).x));
                root.getChildren().add(clickTile);
            }
        }
        
        for (int x = 0; x < 7; x++) {
            CheckBox checkBox = new CheckBox();
            checkBox.setLayoutX(100);
            checkBox.setLayoutY(180f + 40 * x);
            animals[x] = checkBox;
            root.getChildren().add(checkBox);
        }
        area.setLayoutX(100);
        area.setLayoutY(100);
        area.setOnAction(this::handleAreaChange);
        root.getChildren().add(area);
        primaryStage.show();
    }
    
    private void handleAreaChange(ActionEvent event) {
        ComboBox<String> comboBox = (ComboBox) event.getSource();
        System.out.println(comboBox.getValue());
    }
}
