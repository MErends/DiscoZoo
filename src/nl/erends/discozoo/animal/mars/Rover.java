package nl.erends.discozoo.animal.mars;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Rover extends Animal {

    public Rover() {
        this.tile = Tile.ROVER;
        this.pattern = new Tile[][]{{null, tile, null},
                                    {tile, null, tile}};
    }
}
