//write a java program to get a number from the user and print whether it is positive or negative

import java.util.Scanner;
public class Numbers
{
	public static void main (String args[])
	{
	  
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");

        int num = sc.nextInt();
	
		if(num>0)
		{
		System.out.println("it is a positive number");
		}
		else if(num<0)
		{
		System.out.println("it is a negative number");
		}
		else
		{
		System.out.println("the number is zero");
		}
		sc.close();
	}
}

	