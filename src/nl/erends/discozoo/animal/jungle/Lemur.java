package nl.erends.discozoo.animal.jungle;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Lemur extends Animal {

    public Lemur() {
        this.tile = Tile.LEMUR;
        this.pattern = new Tile[][]{{tile, null},
                                    {null, tile},
                                    {tile, null}};
    }
}
