package Projects;

import java.util.Scanner;

public class SimpleArraySum
{
	public static void main(String[] args) 
	{
			int n,sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter how much element you want???");
			n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter "+n+" elements");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				sum=sum+a[i];
			}
			System.out.println("sum = "+sum);
	}
}
