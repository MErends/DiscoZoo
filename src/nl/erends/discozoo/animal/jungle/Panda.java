package nl.erends.discozoo.animal.jungle;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Panda extends Animal {

    public Panda() {
        this.tile = Tile.PANDA;
        this.pattern = new Tile[][]{{null, null, tile},
                                    {tile, null, null},
                                    {null, null, tile}};
    }
}
