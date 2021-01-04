package nl.erends.discozoo.animal.farm;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Pig extends Animal {

    public Pig() {
        this.tile = Tile.PIG;
        this.pattern = new Tile[][]{{tile, tile},
                                    {tile, tile}};
    }
}
