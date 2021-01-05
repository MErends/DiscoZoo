package nl.erends.discozoo.animal.jurassic;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Triceratops extends Animal {

    public Triceratops() {
        this.tile = Tile.TRICERATOPS;
        this.pattern = new Tile[][]{{tile, null, null},
                                    {null, null, tile},
                                    {tile, null, null}};
    }
}
