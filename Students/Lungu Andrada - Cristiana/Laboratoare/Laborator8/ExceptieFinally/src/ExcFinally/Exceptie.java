package ExcFinally;
//import java.util.*;
public class Exceptie {

	
	public static void main(String[] args) {
		int a=9;
		int b=0;
		int result;
		try {
			
			result=a/b;
			System.out.println("resultatul="+result);
		}
		catch (ArithmeticException e) {
			//((ExceptieNume) e).ExceptieNume("tip gresit");
			System.out.println("Exception caught:Division by zero");
		}
		finally {
			System.out.println("Finally called");
		}
		
	}
}
