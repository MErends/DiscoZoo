package nl.erends.discozoo.animal.polar;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Penguin extends Animal {
    
    public Penguin() {
        this.tile = Tile.PENGUIN;
        this.pattern = new Tile[][]{{null, tile, null},
                                    {null, tile, null},
                                    {tile, null, tile}};
    }
}
