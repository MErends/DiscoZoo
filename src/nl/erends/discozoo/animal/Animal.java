package nl.erends.discozoo.animal;

import nl.erends.discozoo.Tile;

public abstract class Animal {
    
    protected Tile tile;
    protected Tile[][] pattern;
    
    
    public int getWidth() {
        return pattern[0].length;
    }
    
    public int getHeight() {
        return pattern.length;
    }

    public Tile getTile() {
        return tile;
    }

    public Tile[][] getPattern() {
        return pattern;
    }
}
