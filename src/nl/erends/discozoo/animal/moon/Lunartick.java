package nl.erends.discozoo.animal.moon;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Lunartick extends Animal {

    public Lunartick() {
        this.tile = Tile.LUNARTICK;
        this.pattern = new Tile[][]{{null, tile, null},
                                    {null, null, null},
                                    {null, tile, null},
                                    {tile, null, tile}};
    }
}
