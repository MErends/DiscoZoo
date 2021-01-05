package nl.erends.discozoo.animal.jurassic;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Ankylo extends Animal {

    public Ankylo() {
        this.tile = Tile.ANKYLO;
        this.pattern = new Tile[][]{{null, null, tile},
                                    {tile, null, tile}};
    }
}
