package data_structures;

import java.util.*;

public class DinnerDecider {
	static ArrayList<String> food = new ArrayList<String>();
	static Random r = new Random();
	public static void main(String[] args) {
		food.add("pasta");
		food.add("chicken");
		food.add("beef");
		food.add("candy");
		System.out.println("You should eat " + food.get(r.nextInt(food.size())));
	}
}
