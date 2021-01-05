package nl.erends.discozoo.animal.iceage;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Sloth extends Animal {

    public Sloth() {
        this.tile = Tile.SLOTH;
        this.pattern = new Tile[][]{{tile, null, null},
                                    {null, null, tile},
                                    {tile, null, tile}};
    }
}
