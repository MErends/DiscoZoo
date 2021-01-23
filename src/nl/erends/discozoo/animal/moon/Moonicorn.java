package nl.erends.discozoo.animal.moon;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Moonicorn extends Animal {

    public Moonicorn() {
        this.tile = Tile.MOONICORN;
        this.pattern = new Tile[][]{{tile, null},
                                    {tile, tile}};
    }
}
