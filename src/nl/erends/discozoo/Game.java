package nl.erends.discozoo;

import nl.erends.discozoo.animal.Animal;
import nl.erends.discozoo.animal.farm.Chicken;
import nl.erends.discozoo.animal.farm.Unicorn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game {
    
    private Field currentField = new Field();
    public List<Field> possibleFields = new ArrayList<>();
    public int[][] combinationsField = new int[5][5];
    public int[][] heatmap = new int[5][5];
    private static final String HORIZONTAL = "+---+---+---+---+---+\n";
    private static final String EMPTY_LINE = "|   |   |   |   |   |\n";
    
    Game() {
        possibleFields.add(new Field());
    }
    
    public void addAnimal(Animal animal) {
        List<Field> newList = new ArrayList<>();
        int maxY = 5 - animal.getHeight();
        int maxX = 5 - animal.getWidth();
        for (Field possibleField : possibleFields) {
            for (int x = 0; x <= maxX; x++) {
                for (int y = 0; y <= maxY; y++) {
                    Field newField = new Field(possibleField);
                    newField.addAnimal(x, y, animal);
                    if (newField.isValid()) {
                        newList.add(newField);
                    }
                }
            }
        }
        possibleFields = newList;

    }

    public void checkWanted() {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                Tile wanted = currentField.getTiles()[y][x];
                if (wanted == null) {
                    continue;
                }
                Iterator<Field> fi = possibleFields.iterator();
                while (fi.hasNext()) {
                    Field possibleField = fi.next();
                    Tile current = possibleField.getTiles()[y][x];
                    if ((wanted == Tile.EMPTY && current != null) ||(wanted != Tile.EMPTY && current != wanted)) {
                        fi.remove();
                    }
                }
            }
        }
    }
    
    public void calcuateHeatMap() {
        for (int y = 0; y < heatmap.length; y++) {
            for (int x = 0; x < heatmap[y].length; x++) {
                int finalX = x;
                int finalY = y;
                combinationsField[y][x] = (int) possibleFields.stream().filter(f -> f.getTiles()[finalY][finalX] != null).count();
                heatmap[y][x] = (int) Math.round(combinationsField[y][x] * 100D / possibleFields.size());
            }
        }
    }

    public void setCurrentFieldTile(int x, int y, Tile tile) {
        currentField.getTiles()[y][x] = tile;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(HORIZONTAL);
        for (int[] line : heatmap) {
            sb.append('|');
            for (int heat : line) {
                sb.append(String.format("%3d", heat));
                sb.append('|');
            }
            sb.append('\n').append(HORIZONTAL);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Game game = new Game();
        game.setCurrentFieldTile(0, 0, Tile.UNICORN);
        game.setCurrentFieldTile(2, 4, Tile.CHICKEN);
        game.addAnimal(new Chicken());
        game.addAnimal(new Unicorn());
        game.checkWanted();
        game.calcuateHeatMap();
        System.out.println();
    }
}
