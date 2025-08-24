package nl.erends.discozoo.animal.pet;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Cat extends Animal {

    public Cat() {
        this.tile = Tile.CAT;
        this.pattern = new Tile[][]{{tile, tile, null},
                {tile, null, null},
                {tile, tile, null}};
    }
}
