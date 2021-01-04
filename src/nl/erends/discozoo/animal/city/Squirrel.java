package nl.erends.discozoo.animal.city;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Squirrel extends Animal {
    
    public Squirrel() {
        this.tile = Tile.SQUIRREL;
        this.pattern = new Tile[][]{{null, null, tile},
                                    {tile, null, null},
                                    {null, tile, null}};
    }
}
