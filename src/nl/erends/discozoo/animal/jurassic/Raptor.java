package nl.erends.discozoo.animal.jurassic;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Raptor extends Animal {

    public Raptor() {
        this.tile = Tile.RAPTOR;
        this.pattern = new Tile[][]{{tile, tile, null},
                                    {null, tile, null},
                                    {null, null, tile}};
    }
}
