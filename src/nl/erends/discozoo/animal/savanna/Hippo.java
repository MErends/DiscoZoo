package nl.erends.discozoo.animal.savanna;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Hippo extends Animal {

    public Hippo() {
        this.tile = Tile.HIPPO;
        this.pattern = new Tile[][]{{tile, null, tile},
                                    {null, null, null},
                                    {tile, null, tile}};
    }
}
