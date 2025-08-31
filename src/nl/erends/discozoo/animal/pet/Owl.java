package nl.erends.discozoo.animal.pet;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Owl extends Animal {

    public Owl() {
        this.tile = Tile.PETOWL;
        this.pattern = new Tile[][]{{tile, null, tile, null, tile},
                {null, tile, null, tile, null}};
    }
}
