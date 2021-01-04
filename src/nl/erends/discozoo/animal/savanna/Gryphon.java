package nl.erends.discozoo.animal.savanna;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Gryphon extends Animal {

    public Gryphon() {
        this.tile = Tile.GRYPHON;
        this.pattern = new Tile[][]{{tile, null, tile},
                                    {null, tile, null}};
    }
}
