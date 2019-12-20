package AnBistectJUnit;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;
public class TestRunner {
	 public static void main(String[] args) {
		 Result rezultat = JUnitCore.runClasses(TestAnBisect.class);
		 System.out.println("Test rulat cu succes: " +
		 rezultat.wasSuccessful());
		 if(!rezultat.wasSuccessful())
		 {
		 System.out.println("Teste esuate:");
		 for (Failure esec : rezultat.getFailures()) {
		 System.out.println(esec.toString());
		 }
		 }
		 } 
}
