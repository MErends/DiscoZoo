package nl.erends.discozoo.animal.outback;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Tiddalik extends Animal {
    
    public Tiddalik() {
        this.tile = Tile.TIDDALIK;
        this.pattern = new Tile[][]{{null, tile, null},
                                    {tile, null, tile}};
    }
}
