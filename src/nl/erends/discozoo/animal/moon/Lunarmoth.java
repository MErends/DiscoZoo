package nl.erends.discozoo.animal.moon;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Lunarmoth extends Animal {

    public Lunarmoth() {
        this.tile = Tile.LUNARMOTH;
        this.pattern = new Tile[][]{{tile, null, tile},
                                    {null, null, null},
                                    {null, tile, null}};
    }
}
