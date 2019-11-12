package ItInt;
import java.util.*;
import java.lang.*;
public class OrderedIterator extends Iterator{
	
	//private static final int  = 0;
	public OrderedIterator(){
		super();
	}
	public static  int comparable(char a,char b) {
		if(a==b)
			return 1;
		else
			return 0;
	}
	

		
	
	public static void main(String[] args) {
		OrderedIterator ord=new OrderedIterator();
		int sem=0;
		//adauga();
		//System.out.println(ord.n);
		/*ord.add('2');
		System.out.println(ord.cards.length);
		ord.add('3');
		ord.add('4');
		ord.add('5');
		ord.add('6');
		ord.add('7');
		ord.add('8');
		ord.add('9');
		ord.add('A');
		ord.add('B');
		ord.add('C');
		ord.add('D');
		ord.add('E');
		System.out.println(ord.n);*/
		char c1='F';
		for(ord.i=0;ord.i<ord.n;ord.i++)
		System.out.println(ord.cards[ord.i]);
		while(ord.hasNext()==true) {
			//char c2=ord.cards[ord.i];
			if(comparable(ord.cards[ord.i],c1)==1) {
				sem++;
			}
			ord.i++;
			
		
		}
		////System.out.println(ord.n);

		ord.i=ord.n;
		//System.out.println(ord.i);
		if (sem==0) {
			
			//ord.cards[ord.i]='F';
			System.out.println(sem);
			//ord.n++;
			ord.add('F');
		}
		System.out.println(ord.n);
		ord.i=0;
		//System.out.println(ord.n);
		while (ord.hasNext()==true) {
	         System.out.print(ord.next() + " "); 

		}
		
}
}
