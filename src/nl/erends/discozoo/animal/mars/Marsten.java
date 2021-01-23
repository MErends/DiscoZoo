package nl.erends.discozoo.animal.mars;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Marsten extends Animal {

    public Marsten() {
        this.tile = Tile.MARSTEN;
        this.pattern = new Tile[][]{{tile, null, tile, null},
                                    {null, null, null, tile}};
    }
}
