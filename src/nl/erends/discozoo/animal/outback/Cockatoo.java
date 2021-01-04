package nl.erends.discozoo.animal.outback;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Cockatoo extends Animal {

    public Cockatoo() {
        this.tile = Tile.COCKATOO;
        this.pattern = new Tile[][]{{tile, null},
                                    {null, tile},
                                    {null, tile}};
    }
}
