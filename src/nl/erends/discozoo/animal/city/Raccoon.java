package nl.erends.discozoo.animal.city;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Raccoon extends Animal {

    public Raccoon() {
        this.tile = Tile.RACCOON;
        this.pattern = new Tile[][]{{tile, null, tile, null},
                                    {tile, null, null, tile}};
    }
}
