package nl.erends.discozoo.animal;

import nl.erends.discozoo.Tile;

public class Mammoth extends Animal {
    
    public Mammoth() {
        this.tile = Tile.MAMMOTH;
        this.pattern = new Tile[][]{{null, tile, null},
                                    {tile, null, null},
                                    {null, null, tile}};
    }
}
