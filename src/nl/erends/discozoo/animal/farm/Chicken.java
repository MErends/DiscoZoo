package nl.erends.discozoo.animal.farm;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Chicken extends Animal {
    
    public Chicken() {
        this.tile = Tile.CHICKEN;
        this.pattern = new Tile[][]{{null, null, tile},
                                    {null, tile, null},
                                    {tile, null, null}};
    }
}
