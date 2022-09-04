import java.util.*;
public class Swap
{
	public static void main (String args[])
	{
		int x,y;
		Scanner s = new Scanner(System.in);
		System.out.println("enter first number");
		x=s.nextInt();
		System.out.println("enter second number");
		y=s.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap first values is"+x);
		System.out.println("After swap second values is"+y);
	}
}