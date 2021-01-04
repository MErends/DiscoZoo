package nl.erends.discozoo.animal.polar;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Muskox extends Animal {
    
    public Muskox() {
        this.tile = Tile.MUSKOX;
        this.pattern = new Tile[][]{{tile, tile, null},
                                    {tile, null, tile}};
    }
}
