package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class BandNameGenerator {
public static void main(String[] args) {
	ArrayList adjectives = new ArrayList<String>();
	ArrayList nouns = new ArrayList<String>();
	adjectives.add("Smelly");
	adjectives.add("Radical");
	adjectives.add("Rockin'");
	nouns.add("Colins");
	nouns.add("Bananas");
	nouns.add("Geese");
	Random r = new Random();
	System.out.println(adjectives.get(r.nextInt(3)) + " " + nouns.get(r.nextInt(3)));
}
}
