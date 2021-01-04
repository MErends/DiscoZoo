package nl.erends.discozoo.animal.city;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.Animal;

public class Pidgeon extends Animal {
    
    public Pidgeon() {
        this.tile = Tile.PIDGEON;
        this.pattern = new Tile[][]{{tile, null, null},
                                    {null, tile, null},
                                    {null, tile, tile}};
    }
}
