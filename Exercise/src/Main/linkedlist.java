package Main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("Lexus");
		cars.add("Subaru");

		System.out.println("-------------------LinkedList displayed----------------------");
		System.out.println(cars);

		System.out.println("-------------------LinkedList displayed using for loop----------------------");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}

		System.out.println("-------------------LinkedList displayed by foreach----------------------");
		for (String carsResult : cars) {
			System.out.println(carsResult);

		}

		System.out.println("------------------HashMap---------------------");
		Map<Integer, String> hashMap = new HashMap<>();

		// Adding values to the Hashmap
		hashMap.put(101, "Zoro");
		hashMap.put(102, "Sanji");
		hashMap.put(103, "Chopper");

		// Retrieving a value
		System.out.println("Value of key 101:" + hashMap.get(101));

		System.out.println("***********************Iterating through Map***********************");

		// Iterating over the Hashmap
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		// Removing a key-value pair
		hashMap.remove(103);

		System.out.println("***********************Checking presence of key in Map***********************");
		// Checking the presence of a key
		if (hashMap.containsKey(102)) {
			System.out.println("Map contains key 102.");
		} else {
			System.out.println("Key not found");
		}

	}

}
