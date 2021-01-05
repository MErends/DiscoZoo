package nl.erends.discozoo.animal.jurassic;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Diplodocus extends Animal {

    public Diplodocus() {
        this.tile = Tile.DIPLODOCUS;
        this.pattern = new Tile[][]{{tile, null, null},
                                    {null, tile, tile},
                                    {null, tile, null}};
    }
}
