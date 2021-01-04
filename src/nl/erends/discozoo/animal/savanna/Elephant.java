package nl.erends.discozoo.animal.savanna;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Elephant extends Animal {

    public Elephant() {
        this.tile = Tile.KOALA;
        this.pattern = new Tile[][]{{tile, tile},
                                    {tile, null}};
    }
}
