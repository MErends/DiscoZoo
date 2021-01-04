package nl.erends.discozoo.animal;

import nl.erends.discozoo.Tile;

public class Sabertooth extends Animal {
    
    public Sabertooth() {
        this.tile = Tile.SABERTOOTH;
        this.pattern = new Tile[][]{{tile, null, null},
                                    {null, null, tile},
                                    {null, tile, null}};
    }
}
