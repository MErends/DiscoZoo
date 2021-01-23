package nl.erends.discozoo;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.List;

public class ClickTile extends StackPane {
    
    private Rectangle rectangle;
    private Text text;

    private Tile tile;

    private ContextMenu contextMenu;

    int x;
    int y;
    
    
    public ClickTile(int x, int y) {
        this.x = x;
        this.y = y;

        rectangle = new Rectangle();
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        text = new Text("X");
        text.setFont(Font.font(36));
        
        getChildren().addAll(rectangle, text);
    }

    public String getText() {
        return text.getText();
    }
    
    public void setText(String value) {
        text.setText(value);
    }

    public Tile getTile() {
        return tile;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public void setColor(Color color) {
        rectangle.setFill(color);
    }



    public void buildContextMenu() {
        contextMenu = new ContextMenu();
        for (CheckBox cb : Main.animals) {
            if (cb.isSelected()) {
                MenuItem menuItem = new MenuItem(cb.getText() + ' ' + getPercentage(cb.getText()) + '%');
                menuItem.setOnAction(this::handleTileClick);
                contextMenu.getItems().add(menuItem);
            }
        }
        contextMenu.getItems().add(new SeparatorMenuItem());
        int emptyPercent = 0;
        try {
            int nonEmpty = Integer.parseInt(text.getText());
            emptyPercent = 100 - nonEmpty;
        } catch (NumberFormatException ne) {}
        MenuItem menuItem = new MenuItem("Empty " + emptyPercent + '%');
        menuItem.setOnAction(this::handleTileClick);
        contextMenu.getItems().add(menuItem);

        this.setOnMouseClicked(e -> contextMenu.show(this, e.getScreenX(), e.getScreenY()));
    }



    private void handleTileClick(ActionEvent event) {
        MenuItem mi = (MenuItem) event.getSource();
        ClickTile clickTile = (ClickTile) mi.getParentPopup().getOwnerNode();
        clickTile.setText(mi.getText().substring(0, 1));
        clickTile.setTile(Tile.valueOf(mi.getText().toUpperCase().split(" ")[0]));
        Main.refreshGrid();
    }

    private int getPercentage(String animal) {
        int count = 0;
        Tile animalTile = Tile.valueOf(animal.toUpperCase());
        List<Field> fields = Main.game.possibleFields;
        for (Field field : fields) {
            if (field.getTiles()[y][x] == animalTile) {
                count++;
            }
        }
        return count == 0 ? count : count * 100 / fields.size();
    }
}
