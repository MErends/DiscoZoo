package nl.erends.discozoo.animal;

import nl.erends.discozoo.Tile;
import nl.erends.discozoo.animal.city.Chipmunk;
import nl.erends.discozoo.animal.city.Opossum;
import nl.erends.discozoo.animal.city.Pidgeon;
import nl.erends.discozoo.animal.city.Raccoon;
import nl.erends.discozoo.animal.city.Rat;
import nl.erends.discozoo.animal.city.Squirrel;
import nl.erends.discozoo.animal.city.Turtle;
import nl.erends.discozoo.animal.farm.*;
import nl.erends.discozoo.animal.northern.Bear;
import nl.erends.discozoo.animal.northern.Beaver;
import nl.erends.discozoo.animal.northern.Fox;
import nl.erends.discozoo.animal.northern.Moose;
import nl.erends.discozoo.animal.northern.Otter;
import nl.erends.discozoo.animal.northern.Sasquatch;
import nl.erends.discozoo.animal.northern.Skunk;
import nl.erends.discozoo.animal.outback.*;
import nl.erends.discozoo.animal.polar.Muskox;
import nl.erends.discozoo.animal.polar.Penguin;
import nl.erends.discozoo.animal.polar.Seal;
import nl.erends.discozoo.animal.savanna.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Animal {
    
    protected Tile tile;
    protected Tile[][] pattern;
    private static final Map<String, List<String>> areaAnimalMap = new HashMap<>();

    static {
        areaAnimalMap.put("Farm", Arrays.asList("Sheep", "Pig", "Rabbit", "Horse", "Cow", "Unicorn", "Chicken"));
        areaAnimalMap.put("Outback", Arrays.asList("Kangaroo", "Platypus", "Crocodile", "Koala", "Cockatoo", "Tiddalik", "Echidna"));
        areaAnimalMap.put("Savanna", Arrays.asList("Zebra", "Hippo", "Giraffe", "Lion", "Elephant", "Gryphon", "Rhino"));
        areaAnimalMap.put("Northern", Arrays.asList("Beaver", "Skunk", "Bear", "Moose", "Fox", "Sasquatch", "Otter"));
        areaAnimalMap.put("Polar", Arrays.asList("Muskox", "Penguin", "Seal", "Polar Bear", "Walrus", "Yeti", "Owl"));
        areaAnimalMap.put("City", Arrays.asList("Pidgeon", "Raccoon", "Rat", "Opossum", "Squirrel", "Turtle", "Chipmunk"));
    }
    
    
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

    public static Animal getAnimal(String name) {
        switch (name.toLowerCase()) {
            case "chicken": return new Chicken();
            case "cow": return new Cow();
            case "horse": return new Horse();
            case "pig": return new Pig();
            case "rabbit": return new Rabbit();
            case "sheep": return new Sheep();
            case "unicorn": return new Unicorn();

            case "kangaroo": return new Kangaroo();
            case "platypus": return new Platypus();
            case "crocodile": return new Crocodile();
            case "koala": return new Koala();
            case "cockatoo": return new Cockatoo();
            case "tiddalik": return new Tiddalik();
            case "echidna": return new Echidna();

            case "zebra": return new Zebra();
            case "hippo": return new Hippo();
            case "giraffe": return new Giraffe();
            case "lion": return new Lion();
            case "elephant": return new Elephant();
            case "gryphon": return new Gryphon();
            case "rhino": return new Rhino();
            
            case "beaver": return new Beaver();
            case "skunk": return new Skunk();
            case "bear": return new Bear();
            case "moose": return new Moose();
            case "fox": return new Fox();
            case "sasquatch": return new Sasquatch();
            case "otter": return new Otter();
            
            case "seal": return new Seal();
            case "penguin": return new Penguin();
            case "muskox": return new Muskox();

            case "pidgeon": return new Pidgeon();
            case "raccoon": return new Raccoon();
            case "rat": return new Rat();
            case "squirrel": return new Squirrel();
            case "opossum": return new Opossum();
            case "turtle": return new Turtle();
            case "chipmunk": return new Chipmunk();
            
            default: throw new IllegalArgumentException(name);
        }
    }

    public static List<String> getAnimals(String area) {
        return areaAnimalMap.get(area);
    }
}
