package nl.erends.discozoo.animal.city;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Rat extends Animal {

    public Rat() {
        this.tile = Tile.RAT;
        this.pattern = new Tile[][]{{tile, tile, null, null},
                                    {null, tile, null, tile}};
    }
}
