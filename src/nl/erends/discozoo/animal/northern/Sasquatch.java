package nl.erends.discozoo.animal.northern;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Sasquatch extends Animal {

    public Sasquatch() {
        this.tile = Tile.SASQUATCH;
        this.pattern = new Tile[][]{{tile},
                                    {tile}};
    }
}
