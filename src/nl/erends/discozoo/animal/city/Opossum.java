package nl.erends.discozoo.animal.city;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Opossum extends Animal {

    public Opossum() {
        this.tile = Tile.OPOSSUM;
        this.pattern = new Tile[][]{{tile, null, null},
                                    {tile, null, tile}};
    }
}
