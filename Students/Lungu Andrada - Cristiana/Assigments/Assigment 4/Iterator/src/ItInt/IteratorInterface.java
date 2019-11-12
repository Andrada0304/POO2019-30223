package ItInt;
import java.io.*;
import java.util.*;
public class IteratorInterface {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
	ArrayList cards = new ArrayList(); 
	  
     cards.add("2"); 
     cards.add("3"); 
     cards.add("4"); 
     cards.add("5"); 
     cards.add("6"); 
     cards.add("7"); 
     cards.add("8"); 
     cards.add("9"); 
     cards.add("10"); 
     cards.add("J"); 
     cards.add("Q"); 
     cards.add("K"); 
     cards.add("A"); 
     
     

     // Iterator to traverse the list 
     @SuppressWarnings("rawtypes")
	java.util.Iterator iterator = cards.iterator(); 

     System.out.println("List elements : "); 

     while (iterator.hasNext()) 
         System.out.print(iterator.next() + " "); 

     System.out.println(); 
     
     iterator.remove();
    // while (iterator.hasNext()) 
         System.out.println("After the remove() method is called : "+cards); 

}

}
