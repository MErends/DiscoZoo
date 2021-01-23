package nl.erends.discozoo.animal.moon;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Moonkey extends Animal {

    public Moonkey() {
        this.tile = Tile.MOONKEY;
        this.pattern = new Tile[][]{{tile, null, null},
                                    {tile, null, tile},
                                    {null, null, tile}};
    }
}
