package Java_Assignment1;

import java.io.*;

import java.util.*;

import java.lang.Math;

public class SimpleAndCompoundInterest 
{
	
static double simpleInterest(double p,double t,double r)
	
{
		
double simple;
		
simple=(p*t*r)/100;
		
return simple;
		
	
}
	
static double compoundInterest(double p,double t,double r) 
	
{
		
double compound;
		
compound= p*(Math.pow((1 + (r/100)),t));
		
return compound;
	
}
	
public static void main(String[] args) 

{
		
Scanner sc = new Scanner(System.in);
		
double p,t,r;
		
double s,c;
		
System.out.println("Enter Principal: ");
		
p=sc.nextInt();
		
System.out.println("Enter Time: ");
		
t=sc.nextInt();
		
System.out.println("Enter Rate: ");
		
r=sc.nextInt();
		
s=simpleInterest(p,t,r);
		
c=compoundInterest(p,t,r);
		
System.out.println("Simple Interest is "+ s + " and Compound Interest is " + c);
		
	
}
}
