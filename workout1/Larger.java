import java.util.Scanner;
public class Larger
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=s.nextInt();
		System.out.println("Enter the second number:");
		b=s.nextInt();
		System.out.println("Enter the Third number:");
		c=s.nextInt();
		if(a>b && a>c)
		{
		System.out.println("largest number is:"+a);
		}
		else if(b>c)
		{
		System.out.println("largest number is:"+b);
		}
		else
		{
		System.out.println("largest number is:"+c);
		}
	}
}

