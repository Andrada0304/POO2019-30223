package ExceptiaMea;
import java.util.*;
import java.lang.*;
public class TestExceptie extends Exception{
	public static void main(String[] args) {
		Animal dog=null;
		try {
			dog=new Animal("dog ",-5);
		}
		catch (ExceptieNume e) {
			System.out.println(e.getMessage());
		}
	}
		
}
