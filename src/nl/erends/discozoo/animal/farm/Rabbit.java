package nl.erends.discozoo.animal.farm;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Rabbit extends Animal {

    public Rabbit() {
        this.tile = Tile.RABBIT;
        this.pattern = new Tile[][]{{tile}, {tile}, {tile}, {tile}};
    }
}
