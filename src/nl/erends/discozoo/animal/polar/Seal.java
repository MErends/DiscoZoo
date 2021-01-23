package nl.erends.discozoo.animal.polar;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Seal extends Animal {

    public Seal() {
        this.tile = Tile.SEAL;
        this.pattern = new Tile[][]{{tile, null, null, null},
                                    {null, tile, null, tile},
                                    {null, null, tile, null}};
    }
}
