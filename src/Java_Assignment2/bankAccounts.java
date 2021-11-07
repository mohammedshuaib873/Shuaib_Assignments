package Java_Assignment2;

import java.io.*;
import java.util.*;
public class bankAccounts 
{
	public static void main(String[] args) {
		int a1,a2,TotalCash;
		bankAccounts b1=new SavingsAccount();
		bankAccounts b2= new CurrentAccount();
		a1=((SavingsAccount) b1).cash();
		a2=((CurrentAccount) b2).cash();
		TotalCash=a1+a2;
		System.out.println("Total cash in the bank is Rs."+TotalCash);
	}

}
class SavingsAccount extends bankAccounts
{
	int cash()
	{
		int FixedDeposit=100000;
		return FixedDeposit;
		
	}
}
class CurrentAccount extends bankAccounts
{
	int cash()
	{
		int CashCredit=200000;
		return CashCredit;
	}
}
