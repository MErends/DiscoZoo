package nl.erends.discozoo.animal.iceage;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Camel extends Animal {

    public Camel() {
        this.tile = Tile.CAMEL;
        this.pattern = new Tile[][]{{null, null, tile, null},
                                    {tile, null, null, null},
                                    {null, null, null, tile}};
    }
}
