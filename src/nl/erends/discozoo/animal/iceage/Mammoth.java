package nl.erends.discozoo.animal.iceage;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Mammoth extends Animal {

    public Mammoth() {
        this.tile = Tile.MAMMOTH;
        this.pattern = new Tile[][]{{null, tile, null},
                                    {tile, null, null},
                                    {null, null, tile}};
    }
}
