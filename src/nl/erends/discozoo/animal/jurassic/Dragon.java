package nl.erends.discozoo.animal.jurassic;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Dragon extends Animal {

    public Dragon() {
        this.tile = Tile.DRAGON;
        this.pattern = new Tile[][]{{tile, null, null},
                                    {null, null, tile}};
    }
}
