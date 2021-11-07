package Java_Assignment2;

import java.io.*;
import java.util.*;
public class Singleton 
{
	// Create private attribute that refers to a singleton object
	private static Singleton single=new Singleton();
	
	//Create private constructor that restricts the object to create object
	//outside the class.
	private Singleton()
	{
		
	}
	//Allows us to create and access the object we created.
	public static Singleton getInstance()
	{
		return single;
	}
	public void getInfo()
	{
		System.out.println("In Singleton class...!!!");
	}

}
