package nl.erends.discozoo.animal.jurassic;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Trex extends Animal {

    public Trex() {
        this.tile = Tile.TREX;
        this.pattern = new Tile[][]{{tile, null},
                                    {null, null},
                                    {tile, tile}};
    }
}
