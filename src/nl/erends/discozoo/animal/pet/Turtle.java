package nl.erends.discozoo.animal.pet;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Turtle extends Animal {

    public Turtle() {
        this.tile = Tile.PETTURTLE;
        this.pattern = new Tile[][]{{tile, tile, tile},
                {null, tile, null},
                {null, tile, null}};
    }
}
