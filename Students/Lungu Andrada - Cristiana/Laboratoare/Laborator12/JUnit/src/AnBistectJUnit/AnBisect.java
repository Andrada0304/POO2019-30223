package AnBistectJUnit;

public class AnBisect {
	public static boolean esteAnBisect(int an) {
		if (an%4!=0){
	        return false;
	   }

	    else{
	        if(an%100!=0){
	            return true;
	        }

	        else{
	            if(an%400!=0){
	                return false;
	            }


	            else {
	               return true;
	            }
	        }
	    }
	}
}
