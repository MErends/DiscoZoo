package nl.erends.discozoo.animal.moon;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Jaderabbit extends Animal {

    public Jaderabbit() {
        this.tile = Tile.JADERABBIT;
        this.pattern = new Tile[][]{{tile, null},
                                    {null, null},
                                    {null, tile}};
    }
}
