package nl.erends.discozoo.animal.outback;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Crocodile extends Animal {
    
    public Crocodile() {
        this.tile = Tile.CROCODILE;
        this.pattern = new Tile[][]{{tile, tile, tile, tile}};
    }
}
