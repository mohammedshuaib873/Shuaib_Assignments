package Java_Assignment4_Exceptional_Handling;

import java.util.Scanner;

public class UnSupportedExceptionHandling
{
	public static void main(String[] args) 
	{
		Scanner sc = null;
		try {
		    sc = new Scanner(System.in);
			System.out.println("Enter The First Number:");
			int a = sc.nextInt();
			System.out.println("Enter The Second Number:");
			int b = sc.nextInt();
			int c = (a/b);
			System.out.println("Division of Two Numbers: "+c);
			throw new UnsupportedOperationException("Invalid operation Since it is Not Divisible by Zero");
		} catch (java.lang.UnsupportedOperationException e) {
	        e.printStackTrace();
	    }
		finally 
		{
		  if(sc != null)
		  {
			  sc.close();
		  }
		}
	}

}

