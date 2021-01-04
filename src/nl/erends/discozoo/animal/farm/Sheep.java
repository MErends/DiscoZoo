package nl.erends.discozoo.animal.farm;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Sheep extends Animal {
    
    public Sheep() {
        this.tile = Tile.SHEEP;
        this.pattern = new Tile[][]{{tile, tile, tile, tile}};
    }
}
