package Main;

import java.util.*;  
public class linkedlistprogram{  
public static void main(String args[]){  
LinkedList<String> linkedList=new LinkedList<String>();  
linkedList.add("Ravi");  
linkedList.add("Vijay");  
linkedList.add("Ravi");  
linkedList.add("Ajay");  
Iterator<String> iterator=linkedList.iterator();  

while(iterator.hasNext()){  
System.out.println(iterator.next());  
}  
}  
}  
