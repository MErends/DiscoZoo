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
import nl.erends.discozoo.animal.iceage.Akhlut;
import nl.erends.discozoo.animal.iceage.Camel;
import nl.erends.discozoo.animal.iceage.Mammoth;
import nl.erends.discozoo.animal.iceage.Sabertooth;
import nl.erends.discozoo.animal.iceage.Sloth;
import nl.erends.discozoo.animal.iceage.Wolf;
import nl.erends.discozoo.animal.iceage.Wooly;
import nl.erends.discozoo.animal.jungle.Gorilla;
import nl.erends.discozoo.animal.jungle.Lemur;
import nl.erends.discozoo.animal.jungle.Monkey;
import nl.erends.discozoo.animal.jungle.Panda;
import nl.erends.discozoo.animal.jungle.Phoenix;
import nl.erends.discozoo.animal.jungle.Tiger;
import nl.erends.discozoo.animal.jungle.Toucan;
import nl.erends.discozoo.animal.jurassic.Ankylo;
import nl.erends.discozoo.animal.jurassic.Diplodocus;
import nl.erends.discozoo.animal.jurassic.Dragon;
import nl.erends.discozoo.animal.jurassic.Raptor;
import nl.erends.discozoo.animal.jurassic.Stegosaurus;
import nl.erends.discozoo.animal.jurassic.Trex;
import nl.erends.discozoo.animal.jurassic.Triceratops;
import nl.erends.discozoo.animal.northern.Bear;
import nl.erends.discozoo.animal.northern.Beaver;
import nl.erends.discozoo.animal.northern.Fox;
import nl.erends.discozoo.animal.northern.Moose;
import nl.erends.discozoo.animal.northern.Otter;
import nl.erends.discozoo.animal.northern.Sasquatch;
import nl.erends.discozoo.animal.northern.Skunk;
import nl.erends.discozoo.animal.outback.*;
import nl.erends.discozoo.animal.polar.Muskox;
import nl.erends.discozoo.animal.polar.Owl;
import nl.erends.discozoo.animal.polar.Penguin;
import nl.erends.discozoo.animal.polar.Polarbear;
import nl.erends.discozoo.animal.polar.Seal;
import nl.erends.discozoo.animal.polar.Walrus;
import nl.erends.discozoo.animal.polar.Yeti;
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
        areaAnimalMap.put("Polar", Arrays.asList("Muskox", "Penguin", "Seal", "Polarbear", "Walrus", "Yeti", "Owl"));
        areaAnimalMap.put("Jungle", Arrays.asList("Monkey", "Toucan", "Gorilla", "Panda", "Tiger", "Phoenix", "Lemur"));
        areaAnimalMap.put("Jurassic", Arrays.asList("Diplodocus", "Stegosaurus", "Raptor", "Trex", "Triceratops", "Dragon", "Ankylo"));
        areaAnimalMap.put("Ice Age", Arrays.asList("Wooly", "Sloth", "Wolf", "Sabertooth", "Mammoth", "Akhlut", "Camel"));
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
            case "walrus": return new Walrus();
            case "polarbear": return new Polarbear();
            case "yeti": return new Yeti();
            case "owl": return new Owl();

            case "monkey": return new Monkey();
            case "toucan": return new Toucan();
            case "gorilla": return new Gorilla();
            case "panda": return new Panda();
            case "tiger": return new Tiger();
            case "phoenix": return new Phoenix();
            case "lemur": return new Lemur();

            case "diplodocus": return new Diplodocus();
            case "stegosaurus": return new Stegosaurus();
            case "raptor": return new Raptor();
            case "trex": return new Trex();
            case "triceratops": return new Triceratops();
            case "dragon": return new Dragon();
            case "ankylo": return new Ankylo();

            case "wooly": return new Wooly();
            case "sloth": return new Sloth();
            case "wolf": return new Wolf();
            case "sabertooth": return new Sabertooth();
            case "mammoth": return new Mammoth();
            case "akhlut": return new Akhlut();
            case "camel": return new Camel();

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
