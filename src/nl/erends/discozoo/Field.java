package nl.erends.discozoo;

import nl.erends.discozoo.animal.Animal;

public class Field {
    
    private boolean valid = true;
    private Tile[][] tiles = new Tile[5][5];

    public Field() {
        
    }
    
    public Field(Field field) {
        for (int y = 0; y < field.tiles.length; y++) {
            for (int x = 0; x < field.tiles[y].length; x++) {
                this.tiles[y][x] = field.tiles[y][x];
            }
        }
    }
    
    public void addAnimal(int offsetX, int offsetY, Animal animal) {
        int endX = animal.getWidth();
        int endY = animal.getHeight();
        for (int y = 0; y < endY; y++) {
            for (int x = 0; x < endX; x++) {
                Tile animalTile = animal.getPattern()[y][x];
                if (animalTile != null && tiles[offsetY + y][offsetX + x] != null) {
                    valid = false;
                    return;
                }
                if (animalTile != null) {
                    tiles[offsetY + y][offsetX + x] = animalTile;
                }
            }
        }
    }

    public boolean isValid() {
        return valid;
    }

    public Tile[][] getTiles() {
        return tiles;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Tile[] row : tiles) {
            for (Tile tile : row) {
                sb.append(tile == null ? '.' : tile.toString().substring(0, 1));
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
