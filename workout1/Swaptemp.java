import java.util.*;
public class Swaptemp
{
	public static void main (String args[])
	{
		int x,y,z;
		Scanner s = new Scanner(System.in);
		System.out.println("enter first number");
		x=s.nextInt();
		System.out.println("enter second number");
		y=s.nextInt();
		z=x;
		x=y;
		y=z;
		System.out.println("After swap first values is"+x);
		System.out.println("After swap second values is"+y);
	}
}