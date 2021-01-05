package nl.erends.discozoo.animal.jungle;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Monkey extends Animal {

    public Monkey() {
        this.tile = Tile.MONKEY;
        this.pattern = new Tile[][]{{tile, null, tile, null},
                                    {null, tile, null, tile}};
    }
}
