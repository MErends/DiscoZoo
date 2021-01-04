package nl.erends.discozoo;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ClickTile extends StackPane {
    
    private Rectangle rectangle;
    private Text text;
    
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
    
    
    
}
