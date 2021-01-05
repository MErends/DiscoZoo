package nl.erends.discozoo.animal.iceage;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Akhlut extends Animal {

    public Akhlut() {
        this.tile = Tile.AKHLUT;
        this.pattern = new Tile[][]{{null, null, tile},
                                    {tile, null, null},
                                    {null, null, tile}};
    }
}
