
public class fibonacci {

	public static void main(String[] args) {
		int f=0;
		int s=1;
		
		for (int i=0;i<=8;i++) {
			System.out.println(f);
			
			/*
			 * if(f==5) break;
			 */ 
			 
			int t= f+s;
			  f=s;
			  s=t;
				
		
		
		
		}

	}

}
