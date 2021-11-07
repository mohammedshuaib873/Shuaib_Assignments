package Java_Assignment4_Exceptional_Handling;

import java.util.Scanner;

public class ArithmeticExceptionHandling
{
	public static void main(String[] args) 
	{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The First Number:");
			int a = sc.nextInt();
			System.out.println("Enter The Second Number:");
			int b = sc.nextInt();
			int c = (a/b);
			System.out.println("Division of Two Numbers: "+c);
			sc.close();
		} catch (ArithmeticException ae) {
	         System.out.println("Division By Zero Is Not Allowed");
	    }	
	}

}
