package nl.erends.discozoo.animal.northern;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Bear extends Animal {
    
    public Bear() {
        this.tile = Tile.BEAR;
        this.pattern = new Tile[][]{{tile, tile},
                                    {null, tile},
                                    {null, tile}};
    }
}
