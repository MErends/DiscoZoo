package nl.erends.discozoo.animal.outback;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Kangaroo extends Animal {

    public Kangaroo() {
        this.tile = Tile.KANGAROO;
        this.pattern = new Tile[][]{{tile, null, null, null},
                                    {null, tile, null, null},
                                    {null, null, tile, null},
                                    {null, null, null, tile}};
    }
}
