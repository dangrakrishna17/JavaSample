package Projects;

import java.util.Scanner;

public class DiagonalDifference 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		int i,j,d1=0,d2=0;
		int a[][]=new int[n][n];
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(i==j)
				{
					d1=d1+a[i][j];
				}
				if(i==(n-j-1))
				{
					d2=d2+a[i][j];
				}
			}
		}
		System.out.println(Math.abs(d1-d2));
	}

}
