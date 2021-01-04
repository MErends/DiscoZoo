package nl.erends.discozoo.animal.polar;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Walrus extends Animal {
    
    public Walrus() {
        this.tile = Tile.WALRUS;
        this.pattern = new Tile[][]{{tile, null, null},
                                    {null, tile, tile}};
    }
}
