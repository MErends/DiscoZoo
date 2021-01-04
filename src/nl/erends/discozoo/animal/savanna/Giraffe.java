package nl.erends.discozoo.animal.savanna;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Giraffe extends Animal {

    public Giraffe() {
        this.tile = Tile.GIRAFFE;
        this.pattern = new Tile[][]{{tile}, {tile}, {tile}, {tile}};
    }
}
