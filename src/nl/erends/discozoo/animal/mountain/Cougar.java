package nl.erends.discozoo.animal.mountain;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Cougar extends Animal {
    
    public Cougar() {
        this.tile = Tile.COUGAR;
        this.pattern = new Tile[][]{{tile, null, null},
                                    {null, tile, null},
                                    {tile, null, tile}};
    }
}
