package Java_Assignment2_Organization;

import java.io.*;
import java.util.*;
public class Employee 
{
	void salary()
	{
		int sal=25000;
		System.out.println("The salary of an Employee is Rs:" +sal);
		
	}
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.salary();
		Manager m1=new Manager();
		m1.salary();
		Labour l1=new Labour();
		l1.salary();	
	}

}
