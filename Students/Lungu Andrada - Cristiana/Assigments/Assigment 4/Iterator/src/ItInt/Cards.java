package ItInt;
import java.util.*;
public class Cards extends Iterator {
	
	public Cards(){
		super();
	}

	public static void main(String[] args) {
		 Cards Card=new Cards();
		int r=(int)Math.ceil(Math.random()*13);
		System.out.println("cartea cu numarul "+r+" este "+Card.cards[r]);

		
	}
}
