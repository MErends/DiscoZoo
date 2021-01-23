package nl.erends.discozoo.animal.mars;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Martian extends Animal {

    public Martian() {
        this.tile = Tile.MARTIAN;
        this.pattern = new Tile[][]{{tile, null, tile},
                                    {null, tile, null}};
    }
}
