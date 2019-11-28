package IndexOutOfBound;

public class ArrayOutOfBounds {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		try {
			for(int i=0;i<5;i++)
				System.out.println(arr[7]);
		}
		catch (Exception e ){
			System.out.println("error-index out of bounds");
		}
	}

}

