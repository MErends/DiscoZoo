package nl.erends.discozoo.animal.jungle;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Phoenix extends Animal {

    public Phoenix() {
        this.tile = Tile.PHOENIX;
        this.pattern = new Tile[][]{{tile, null, null},
                                    {null, null, null},
                                    {null, null, tile}};
    }
}
