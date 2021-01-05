package nl.erends.discozoo.animal.polar;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Owl extends Animal {

    public Owl() {
        this.tile = Tile.OWL;
        this.pattern = new Tile[][]{{tile, tile},
                                    {null, tile}};
    }
}
