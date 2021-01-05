package nl.erends.discozoo.animal.iceage;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Wolf extends Animal {

    public Wolf() {
        this.tile = Tile.WOLF;
        this.pattern = new Tile[][]{{null, tile, null, null},
                                    {tile, null, null, tile},
                                    {null, tile, null, null}};
    }
}
