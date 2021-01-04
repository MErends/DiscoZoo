package nl.erends.discozoo.animal.savanna;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Rhino extends Animal {

    public Rhino() {
        this.tile = Tile.RHINO;
        this.pattern = new Tile[][]{{null, tile},
                                    {tile, null},
                                    {null, tile}};
    }
}
