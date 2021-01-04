package nl.erends.discozoo.animal.northern;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Otter extends Animal {

    public Otter() {
        this.tile = Tile.OTTER;
        this.pattern = new Tile[][]{{tile, null},
                                    {tile, tile}};
    }
}
