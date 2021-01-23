package nl.erends.discozoo.animal.mars;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Marsmallow extends Animal {

    public Marsmallow() {
        this.tile = Tile.MARSMALLOW;
        this.pattern = new Tile[][]{{tile}, {null}, {tile}};
    }
}
