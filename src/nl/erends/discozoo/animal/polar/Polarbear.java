package nl.erends.discozoo.animal.polar;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Polarbear extends Animal {

    public Polarbear() {
        this.tile = Tile.POLARBEAR;
        this.pattern = new Tile[][]{{tile, null, tile},
                                    {null, null, tile}};
    }
}
