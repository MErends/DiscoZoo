package nl.erends.discozoo.animal.farm;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Unicorn extends Animal {
    
    public Unicorn() {
        this.tile = Tile.UNICORN;
        this.pattern = new Tile[][]{{tile, null, null},
                                    {null, tile, tile}};
    }
}
