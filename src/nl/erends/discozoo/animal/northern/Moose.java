package nl.erends.discozoo.animal.northern;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Moose extends Animal {
    
    public Moose() {
        this.tile = Tile.MOOSE;
        this.pattern = new Tile[][]{{tile, null, tile},
                                    {null, tile, null}};
    }
}
