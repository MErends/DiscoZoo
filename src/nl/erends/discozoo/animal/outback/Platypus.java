package nl.erends.discozoo.animal.outback;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Platypus extends Animal {
    
    public Platypus() {
        this.tile = Tile.PLATYPUS;
        this.pattern = new Tile[][]{{tile, tile, null},
                                    {null, tile, tile}};
    }
}
