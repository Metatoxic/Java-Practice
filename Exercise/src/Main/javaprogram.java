package Main;

import java.util.ArrayList;
import java.util.Iterator;

public class javaprogram {

	public static void main(String args[]) {
//		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
//		list.add("Sasuke");//Adding object in arraylist  
//		list.add("Naruto");  
//		list.add("Madara");  
//		list.add("hashirama");  
//		//Traversing list through Iterator  
//		Iterator itr=list.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		}  
		System.out.println("Test 1");
		
		//To store values Dynamically, ps: length of array must be given.
		int[] numbers = new int[10];
		
		//To store values in the array straight away after declaration
		int[] box = {1,2,3,4,5};
		System.out.println(box[1]);
		
		//To create a 2D array (only declaration no initialization)
		int[][] box2 = new int[2][3]; // 2 rows and 3 columns
		
	}
}
