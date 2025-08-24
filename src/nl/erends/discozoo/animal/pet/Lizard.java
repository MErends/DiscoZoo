package nl.erends.discozoo.animal.pet;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Lizard extends Animal {

    public Lizard() {
        this.tile = Tile.LIZARD;
        this.pattern = new Tile[][]{{tile, null, null},
                {tile, null, null},
                {tile, tile, tile}};
    }
}
