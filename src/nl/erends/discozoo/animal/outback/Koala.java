package nl.erends.discozoo.animal.outback;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Koala extends Animal {
    
    public Koala() {
        this.tile = Tile.KOALA;
        this.pattern = new Tile[][]{{tile, tile},
                                    {null, tile}};
    }
}
