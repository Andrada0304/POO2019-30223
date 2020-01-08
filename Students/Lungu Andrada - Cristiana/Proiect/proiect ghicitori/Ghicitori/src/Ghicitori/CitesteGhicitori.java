package Ghicitori;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//import RiddleProgram.Riddle;

public class CitesteGhicitori {
	 public static ArrayList<String> riddles = new ArrayList<String>();
	    public static  ArrayList<String> answers = new ArrayList<String>();
	    public static  ArrayList<String> hints = new ArrayList<String>();
	    public static Iterator<String> itRid;
	    public static  Iterator<String> itAns;
	    public static  Iterator<String> itHin;
		public static String[] ghicitori;

		
	    
	    public static void citesteGhicitori() throws FileNotFoundException{
		String riddlesFile = "C:\\Users\\Lenovo\\eclipse-workspace\\Ghicitori\\src\\Ghicitori\\Riddles.txt";
	    Scanner riddleReader = new Scanner(new File(riddlesFile));
	    

	   while(riddleReader.hasNext())
	    {
	        riddles.add(riddleReader.nextLine());
	    }riddleReader.close();
	
	    
	    itRid=riddles.iterator();
	  
		
	    }
	 
		public static void citesteRaspunsuri() throws FileNotFoundException {
			 String answersFile = "C:\\Users\\Lenovo\\eclipse-workspace\\Ghicitori\\src\\Ghicitori\\Answers.txt";
			 Scanner answerReader = new Scanner(new File(answersFile));
			  while(answerReader.hasNext())
			    {	
			       answers.add(answerReader.nextLine());
			    }answerReader.close();
			    itAns=answers.iterator();
		}
		
		public static void citesteIndicii() throws FileNotFoundException {
			 String hintsFile = "C:\\Users\\Lenovo\\eclipse-workspace\\Ghicitori\\src\\Ghicitori\\Hints.txt";
			 Scanner hintsReader = new Scanner(new File(hintsFile));
			  while(hintsReader.hasNext())
			    {	
			       hints.add(hintsReader.nextLine());
			    }hintsReader.close();
			    itHin=hints.iterator();
		}
}
