package nl.erends.discozoo.animal.jungle;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Gorilla extends Animal {

    public Gorilla() {
        this.tile = Tile.GORILLA;
        this.pattern = new Tile[][]{{tile, null, tile},
                                    {tile, null, tile}};
    }
}
