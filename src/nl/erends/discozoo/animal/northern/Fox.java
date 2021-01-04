package nl.erends.discozoo.animal.northern;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Fox extends Animal {
    
    public Fox() {
        this.tile = Tile.FOX;
        this.pattern = new Tile[][]{{tile, tile, null},
                                    {null, null, tile}};
    }
}
