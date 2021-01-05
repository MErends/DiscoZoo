package nl.erends.discozoo.animal.polar;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Yeti extends Animal {

    public Yeti() {
        this.tile = Tile.YETI;
        this.pattern = new Tile[][]{{tile}, {null}, {tile}};
    }
}
