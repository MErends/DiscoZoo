package nl.erends.discozoo.animal.mars;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Marsmoset extends Animal {

    public Marsmoset() {
        this.tile = Tile.MARSMOSET;
        this.pattern = new Tile[][]{{tile, null, tile},
                                    {null, null, tile},
                                    {null, tile, null}};
    }
}
