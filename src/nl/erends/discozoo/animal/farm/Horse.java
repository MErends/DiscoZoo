package nl.erends.discozoo.animal.farm;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Horse extends Animal {

    public Horse() {
        this.tile = Tile.HORSE;
        this.pattern = new Tile[][]{{tile}, {tile}, {tile}};
    }
}
