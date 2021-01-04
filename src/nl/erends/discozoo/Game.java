package nl.erends.discozoo;

import nl.erends.discozoo.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Game {
    
    private Field currentField = new Field();
    public List<Field> possibleFields = new ArrayList<>();
    public int[][] combinationsField = new int[5][5];
    public double[][] heatmap = new double[5][5];
    private static final String HORIZONTAL = "+----+----+----+----+----+\n";
    private static final String EMPTY_LINE = "|    |    |    |    |    |\n";
    
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
        calcuateHeatMap();
    }
    
    public void calcuateHeatMap() {
        for (int y = 0; y < heatmap.length; y++) {
            for (int x = 0; x < heatmap[y].length; x++) {
                int finalX = x;
                int finalY = y;
                combinationsField[y][x] = (int) possibleFields.stream().filter(f -> f.getTiles()[finalY][finalX] != null).count();
                heatmap[y][x] = combinationsField[y][x] * 100D / possibleFields.size();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(HORIZONTAL);
        for (double[] line : heatmap) {
            sb.append('|');
            for (double heat : line) {
                sb.append(String.format("%4.1f", heat));
                sb.append('|');
            }
            sb.append('\n').append(HORIZONTAL);
        }
        return sb.toString();
    }
}
