import java.io.*;

import java.util.*;

import java.lang.Math;

public class ResultOfThreeSubjects 

{
	
static void result(int [] x)
	
{
		
if(x[0] > 60)
		
{
			
if(x[1] > 60)
			
{
				
if(x[2] > 60)
				
{
					
System.out.println("Passed");
				
}
				
else
				
{
					
System.out.println("Promoted");
				
}	
			
}
			
else
			
{
				
System.out.println("Failed");
			
}
		
}

else
		
{
			
System.out.println("Failed");
		
}
	
}

	
public static void main(String[] args) 
	
{
		
Scanner sc=new Scanner(System.in);
		
int i=0,j=0,temp;
		
int a[]=new int[3];
		
System.out.println("Enter marks of three subjects: ");
		
for(i=0;i<3;i++)
		
{
			
a[i]=sc.nextInt();
		
		
}
		
for(i=0;i<3;i++)
		
{
			
for(j=i+1;j<3;j++)
			
{
				
if(a[i] < a[j])
				
{
					
temp=a[i];
					
a[i]=a[j];
					
a[j]=temp;
							
				
}
			
}
		
}
		
result(a);
	
}

}