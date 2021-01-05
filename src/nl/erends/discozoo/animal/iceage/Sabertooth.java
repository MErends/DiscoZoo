package nl.erends.discozoo.animal.iceage;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Sabertooth extends Animal {

    public Sabertooth() {
        this.tile = Tile.SABERTOOTH;
        this.pattern = new Tile[][]{{tile, null, null},
                                    {null, null, tile},
                                    {null, tile, null}};
    }
}
