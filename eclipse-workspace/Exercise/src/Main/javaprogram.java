package Main;

import java.util.ArrayList;
import java.util.Iterator;

public class javaprogram {

	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Sasuke");//Adding object in arraylist  
		list.add("Naruto");  
		list.add("Madara");  
		list.add("hashirama");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		}  
