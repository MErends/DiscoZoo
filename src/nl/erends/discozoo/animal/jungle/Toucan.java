package nl.erends.discozoo.animal.jungle;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Toucan extends Animal {

    public Toucan() {
        this.tile = Tile.TOUCAN;
        this.pattern = new Tile[][]{{null, tile},
                                    {tile, null},
                                    {null, tile},
                                    {null, tile}};
    }
}
