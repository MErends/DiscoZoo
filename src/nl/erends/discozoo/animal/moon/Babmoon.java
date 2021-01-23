package nl.erends.discozoo.animal.moon;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Babmoon extends Animal {

    public Babmoon() {
        this.tile = Tile.BABMOON;
        this.pattern = new Tile[][]{{null, tile, null},
                                    {null, null, tile},
                                    {tile, null, null}};
    }
}
