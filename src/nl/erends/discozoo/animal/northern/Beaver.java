package nl.erends.discozoo.animal.northern;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Beaver extends Animal {
    
    public Beaver() {
        this.tile = Tile.BEAVER;
        this.pattern = new Tile[][]{{null, null, tile},
                                    {tile, tile, null},
                                    {null, null, tile}};
    }
}
