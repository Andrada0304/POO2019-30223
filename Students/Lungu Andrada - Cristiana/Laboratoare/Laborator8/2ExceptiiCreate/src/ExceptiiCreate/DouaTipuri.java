package ExceptiiCreate;

public class DouaTipuri {
	public static void  g(int x) throws ExceptieG {
		if(x<0) {
			throw new ExceptieG("numarul e negativ"+x);
		}
	//	else {
		//	System.out.println("Elementul e bine definit:"+x);
	//	}
	}
	
	public static void f(int[] v) throws ExceptieG, ExceptieF {
		for(int i=0;i<v.length;i++) {
		try {
				
			g(v[i]);
		} catch(ExceptieG e) {
			System.out.println(e.getMessage());
		}
		finally {
		if(v[i]==0) {
				throw new ExceptieF("numarul =0,nu e bine definit");
			}
			else
				if(v[i]>0) {
				System.out.println("Elementul e bine definit:"+v[i]);
				}
				}
		}
		
	}
}
