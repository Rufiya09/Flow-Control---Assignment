//	Write a program in Java to input 5 numbers from keyboard and find their sum and average

import java.util.Scanner;
public class Fivenumbers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	   
	  System.out.print("Enter the 1st number: ");
	  int num1 = sc.nextInt();
	   
	  System.out.print("Enter the 2nd number: ");
	  int num2 = sc.nextInt();
	   
	  System.out.print("Enter the 3rd number: ");
	  int num3 = sc.nextInt();
	  
	  System.out.print("Enter the 4th number: ");
	  int num4 = sc.nextInt();
	   
	  System.out.print("Enter the 5th number: ");
	  int num5 = sc.nextInt();
	  
	  int sum = num1+num2+num3+num4+num5;
	  int avg = sum/2 ;
	  
	  System.out.println("the sum is");
	  System.out.println(sum); 
      System.out.println("the avg is");
	  System.out.println(avg);
	  
	}
}	