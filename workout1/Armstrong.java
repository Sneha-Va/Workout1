import java.util.*;
public class Armstrong
{
	public static void main (String args[])
	{
		int n1, n2;
		Scanner s = new Scanner(System.in);
		System.out.println("enter first interval");
		n1 = s.nextInt();
		System.out.println("enter second  interval");
		n2 = s.nextInt();
		for(int i=n1;i<n2;i++)
		{
		int k,rem,sum=0;
		k=i;
		while(k!=0)
		{
		rem=k%10;
		sum=sum+(rem*rem*rem);
		k=k/10;
		}
		if(sum == i)
		{
		System.out.println(""+i+" is an armstrong number.");
		}
		}
	}
}