package nl.erends.discozoo.animal.jungle;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Tiger extends Animal {

    public Tiger() {
        this.tile = Tile.TIGER;
        this.pattern = new Tile[][]{{tile, null, tile, tile}};
    }
}
