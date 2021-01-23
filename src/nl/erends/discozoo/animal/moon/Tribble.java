package nl.erends.discozoo.animal.moon;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Tribble extends Animal {

    public Tribble() {
        this.tile = Tile.TRIBBLE;
        this.pattern = new Tile[][]{{null, tile, null},
                                    {tile, tile, tile}};
    }
}
