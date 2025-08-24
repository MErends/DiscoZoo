package nl.erends.discozoo.animal.pet;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Rabbit extends Animal {

    public Rabbit() {
        this.tile = Tile.PETTURTLE;
        this.pattern = new Tile[][]{{tile, null, tile},
                {tile, null, tile},
                {null, tile, null}};
    }
}
