package Projects;

import java.util.Scanner;

public class BirthdayCakeCandle
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of Birthday kid??");
		int n=sc.nextInt();
		System.out.println("Candles will be "+n);
		
		int max=0,count=0;
		for(int i=0;i<n;i++)
		{
			int ht=sc.nextInt();
			if(ht>max)
			{
				max=ht;
				count=1;
			}
			else if(ht==max)
			{
				count++;
			}
		}
		System.out.println("Total candle bowed : "+count);
	}
}
