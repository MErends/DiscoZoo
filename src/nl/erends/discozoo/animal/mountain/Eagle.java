package nl.erends.discozoo.animal.mountain;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Eagle extends Animal {

    public Eagle() {
        this.tile = Tile.EAGLE;
        this.pattern = new Tile[][]{{tile, null},
                                    {tile, null},
                                    {null, tile}};
    }
}
