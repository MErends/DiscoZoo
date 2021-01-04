package nl.erends.discozoo.animal.city;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Chipmunk extends Animal {

    public Chipmunk() {
        this.tile = Tile.CHIPMUNK;
        this.pattern = new Tile[][]{{null, tile, null, null},
                                    {tile, null, null, tile}};
    }
}
