package Main;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//To initialize an arraylist 
		ArrayList<String> cars = new ArrayList <String>();
		cars.add("Toyota");
		cars.add("Benz");
		cars.add("Mazda");
		cars.add("Ford");
		
		System.out.println(cars);
		cars.remove(3);
		System.out.println("--------------For Loop to print---------------");
		System.out.println(cars);
		
		for (int i = 0; i < cars.size(); i++) {
		      System.out.println(cars.get(i));
		    }
		System.out.println("*************Foreach to print****************");
		
		for (String carResult : cars) {
			System.out.println(carResult);
		}
		
		
		//Sort the ArrayList
		System.out.println("*************Sorted Arraylist****************");
		Collections.sort(cars);
		 for (String i : cars) {
			System.out.println(i);
		}
	}

}
