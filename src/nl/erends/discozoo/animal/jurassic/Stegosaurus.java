package nl.erends.discozoo.animal.jurassic;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Stegosaurus extends Animal {

    public Stegosaurus() {
        this.tile = Tile.STEGOSAURUS;
        this.pattern = new Tile[][]{{null, tile, tile, null},
                                    {tile, null, null, tile}};
    }
}
