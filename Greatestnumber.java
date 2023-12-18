// take three numbers from the user and print the greatest numbers

import java.util.Scanner;
public class Greatestnumber 
{

    
	  public static void main(String[] args)
	  {
	  Scanner sc = new Scanner(System.in);
	   
	  System.out.print("Enter the 1st number: ");
	  int num1 = sc.nextInt();
	   
	  System.out.print("Enter the 2nd number: ");
	  int num2 = sc.nextInt();
	   
	  System.out.print("Enter the 3rd number: ");
	  int num3 = sc.nextInt();
	   
	   
	  if (num1 > num2)
	   if (num1 > num3)
		System.out.println("The greatest: " + num1);
	   
	  if (num2 > num1)
	   if (num2 > num3)
		System.out.println("The greatest: " + num2);
	   
	  if (num3 > num1)
	   if (num3 > num2)
		System.out.println("The greatest: " + num3);
	  }
}