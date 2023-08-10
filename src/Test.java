
public class Test {

	public static void main(String[] args) {
		
		int a=23;
		int b=95;
		
		
		int c=12;
		
		int d=64;
		
		
		
		System.out.println("Before swapping");
		
		
		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println(c);
		
		System.out.println(d);
		
		System.out.println("After swapping");
		
		
		
		a=a+d;
		
		d=a-d;
		
		a=a-d;
		
		
		System.out.println("a=" +a);
		b=b+d;
		d=b-d;
		b=b-d;
		System.out.println("b=" +b);
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("c=" +c);
		System.out.println("d=" +d);
		
		
	}
}
