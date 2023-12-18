
//Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.


import java.util.Scanner;

public class Weekdays
{
    public static void main(String args[]) 
	{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the day number: ");
        int n = in.nextInt();
        switch (n) {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;

            case 3:
            System.out.println("Tuesday");
            break;

            case 4:
            System.out.println("Wednesday");
            break;

            case 5:
            System.out.println("Thursday");
            break;

            case 6:
            System.out.println("Friday");
            break;

            case 7:
            System.out.println("Saturday");
            break;
            
            default:
            System.out.println("Incorrect day.");
        }
    }
}