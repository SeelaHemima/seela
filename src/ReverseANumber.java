
public class ReverseANumber {

	public static void main(String[] args) {
		int a=12345678;
		for(int i=0;i<=8;i++)
		{
			int b=a%10;
			System.out.print(b);
			a=a/10;
		}
	}

}
