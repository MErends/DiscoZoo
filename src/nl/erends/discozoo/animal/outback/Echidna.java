package nl.erends.discozoo.animal.outback;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Echidna extends Animal {

    public Echidna() {
        this.tile = Tile.ECHIDNA;
        this.pattern = new Tile[][]{{null, null, tile},
                                    {tile, tile, null}};
    }
}
