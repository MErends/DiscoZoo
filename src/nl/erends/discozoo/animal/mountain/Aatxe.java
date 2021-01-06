package nl.erends.discozoo.animal.mountain;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Aatxe extends Animal {

    public Aatxe() {
        this.tile = Tile.AATXE;
        this.pattern = new Tile[][]{{null, null, tile},
                                    {tile, null, null}};
    }
}
