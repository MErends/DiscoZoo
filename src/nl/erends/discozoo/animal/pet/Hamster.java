package nl.erends.discozoo.animal.pet;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Hamster extends Animal {

    public Hamster() {
        this.tile = Tile.HAMSTER;
        this.pattern = new Tile[][]{{tile, null, tile},
                {null, tile, null},
                {tile, null, tile}};
    }
}
