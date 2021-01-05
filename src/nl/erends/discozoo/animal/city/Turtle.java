package nl.erends.discozoo.animal.city;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Turtle extends Animal {

    public Turtle() {
        this.tile = Tile.TURTLE;
        this.pattern = new Tile[][]{{tile, tile}};
    }
}
