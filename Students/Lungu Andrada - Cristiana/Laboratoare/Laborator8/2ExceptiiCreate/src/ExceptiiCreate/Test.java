package ExceptiiCreate;

public class Test {
	public static void main(String[] args) throws ExceptieG {
		int[] v= {1,2,3,-1,0,-5,0,4,5};
		for(int i=0;i<v.length;i++) {
		try {
			DouaTipuri.f(v);
		}catch(ExceptieF e) {
			System.out.println(e.getMessage());
			
		}
		}
	}
}
