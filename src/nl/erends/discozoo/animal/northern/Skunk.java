package nl.erends.discozoo.animal.northern;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Skunk extends Animal {
    
    public Skunk() {
        this.tile = Tile.SKUNK;
        this.pattern = new Tile[][]{{null, tile, tile},
                                    {tile, tile, null}};
    }
}
