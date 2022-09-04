import java.util.*;
public class Reverse
{
	public static void main (String args[])
	{
		int n,rem,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		n=s.nextInt();
		while(n>0)
		{
		rem=n%10;
		rev=(rev*10)+rem;
		n=n/10;
		}
		System.out.println("reverse of number is "+rev);
	}
}