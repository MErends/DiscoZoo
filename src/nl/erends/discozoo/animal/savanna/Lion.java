package nl.erends.discozoo.animal.savanna;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Lion extends Animal {

    public Lion() {
        this.tile = Tile.LION;
        this.pattern = new Tile[][]{{tile, tile, tile}};
    }
}
