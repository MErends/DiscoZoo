package nl.erends.discozoo.animal.farm;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Cow extends Animal {
    
    public Cow() {
        this.tile = Tile.COW;
        this.pattern = new Tile[][]{{tile, tile, tile}};
    }
}
