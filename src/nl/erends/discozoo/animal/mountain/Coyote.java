package nl.erends.discozoo.animal.mountain;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Coyote extends Animal {
    
    public Coyote() {
        this.tile = Tile.COYOTE;
        this.pattern = new Tile[][]{{tile, tile, null},
                                    {null, null, tile}};
    }
}
