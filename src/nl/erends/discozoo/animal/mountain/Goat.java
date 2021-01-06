package nl.erends.discozoo.animal.mountain;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Goat extends Animal {

    public Goat() {
        this.tile = Tile.GOAT;
        this.pattern = new Tile[][]{{tile, null, null},
                                    {tile, tile, tile}};
    }
}
