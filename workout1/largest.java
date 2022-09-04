import java.util.*;
public class largest
{
	public static void main (String args[])
	{
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=s.nextInt();
		System.out.println("Enter the second number:");
		b=s.nextInt();
		System.out.println("Enter the Third number:");
		c=s.nextInt();
		int d=(a>b)?(a>c ? a:c):(b>c ? b:c);
		System.out.println("largest number is" +d);
	}
}