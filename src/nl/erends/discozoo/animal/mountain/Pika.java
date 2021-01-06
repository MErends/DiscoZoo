package nl.erends.discozoo.animal.mountain;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Pika extends Animal {

    public Pika() {
        this.tile = Tile.PIKA;
        this.pattern = new Tile[][]{{tile, null, tile},
                                    {null, null, tile}};
    }
}
