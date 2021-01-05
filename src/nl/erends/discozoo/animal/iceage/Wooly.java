package nl.erends.discozoo.animal.iceage;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Wooly extends Animal {

    public Wooly() {
        this.tile = Tile.WOOLY;
        this.pattern = new Tile[][]{{null, null, tile, null},
                                    {tile, null, null, tile},
                                    {null, tile, null, null}};
    }
}
