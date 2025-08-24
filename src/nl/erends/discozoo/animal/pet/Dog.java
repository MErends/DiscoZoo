package nl.erends.discozoo.animal.pet;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Dog extends Animal {

    public Dog() {
        this.tile = Tile.DOG;
        this.pattern = new Tile[][]{{null, tile},
                {tile, tile},
                {tile, tile}};
    }
}
