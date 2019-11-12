package ItInt;
import java.util.*;

public class Iterator {
	public int i=0;
	public int n=13;
	 //static char[] card=new char[100];
	public char[] cards={'2','3','4','5','6','7','8','9','A','B','C','D','E'};
	//public char[] cards;
	@SuppressWarnings("unused")
	public Iterator() {
		i=0;
		n=13;
	}

/*	public static void add(char key) {
		card[n]=key;
		n++;
	}
	*/	public  void add(char key) {
			this.cards[this.n]=key;
			this.n++;
		//this.n++;
	}/*
	public static char[] addCarti() {
		add('2');
		add('3');
		add('4');
		add('5');
		add('6');
		add('7');
		add('8');
		add('9');
		add('A');
		add('B');
		add('C');
		add('D');
		add('E');
		return card;
	}*/
	public  char next() {
		this.i++;
		return this.cards[i-1];
	}
	
	public boolean hasNext() {
		if (this.i<this.n)
			return true;
		else
			return false;
	}
	
	public void remove() {
		//if(i==13) {
			//n--;
		//}
		//else {
			for (int j=i;j<n-1;j++)
				this.cards[j]=this.cards[j+1];
			this.n--;
		//}
			
			
	}
	/*public static void main(String[] args) {
		//char[] card= {'2','3','4','5','6','7','8','9','A','B','C','D'};
		
		
		System.out.println("List elements : "); 

	     while (hasNext()==true) 
	         System.out.print(next() + " "); 

	     System.out.println(); 
	     
	     remove(i,n,card,n);
	    // System.out.println(n);
	    // while (iterator.hasNext()) 
	         System.out.println("After the remove() method is called : "); 
	         i=0;
	         while (hasNext(i,n)==true) 
		         System.out.print(next(i,card) + " "); 
	}*/
}
