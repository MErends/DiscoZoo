package nl.erends.discozoo.animal.mars;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Marsmot extends Animal {

    public Marsmot() {
        this.tile = Tile.MARSMOT;
        this.pattern = new Tile[][]{{null, tile},
                                    {null, tile},
                                    {tile, tile}};
    }
}
