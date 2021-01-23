package nl.erends.discozoo.animal.mars;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Rock extends Animal {

    public Rock() {
        this.tile = Tile.ROCK;
        this.pattern = new Tile[][]{{tile, tile},
                                    {tile, tile}};
    }
}
