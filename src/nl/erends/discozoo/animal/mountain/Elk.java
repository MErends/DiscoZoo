package nl.erends.discozoo.animal.mountain;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Elk extends Animal {

    public Elk() {
        this.tile = Tile.ELK;
        this.pattern = new Tile[][]{{tile, null, tile},
                                    {null, tile, tile}};
    }
}
