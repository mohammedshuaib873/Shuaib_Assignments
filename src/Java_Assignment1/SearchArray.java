package Java_Assignment1;

import java.io.*;

import java.util.*;

import java.lang.Math;

public class SearchArray 

{
	
public static void main(String[] args) 
	
{
		
Scanner sc=new Scanner(System.in);
		
int a[]=new int[15];
		
int i,key;
		
boolean found=false;
		
System.out.println("Enter 15 elements in the array: ");
		
for(i=0;i<15;i++)
		
{
			
a[i]=sc.nextInt();
		
}
		
System.out.println("Enter the element to be searched: ");
		
key=sc.nextInt();
		
for(i=0;i<15;i++)
		
{
			
if(a[i]==key)
			
{
				
found=true;
				
System.out.println("Key " + key + " found in the array");
				
break;
			
}
		
}
		
if(found==false)
		
{
			
System.out.println("Key " + key + " not found in the array");
		
}

	
}

}

