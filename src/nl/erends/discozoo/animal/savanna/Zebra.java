package nl.erends.discozoo.animal.savanna;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Zebra extends Animal {

    public Zebra() {
        this.tile = Tile.ZEBRA;
        this.pattern = new Tile[][]{{null, tile, null},
                                    {tile, null, tile},
                                    {null, tile, null}};
    }
}
