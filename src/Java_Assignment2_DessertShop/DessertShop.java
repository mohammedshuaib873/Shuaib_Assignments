package Java_Assignment2_DessertShop;

import java.util.Scanner;

public class DessertShop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your role[1.Owner/2.Customer]:");
		int choose=sc.nextInt();
		switch(choose)
		{
			case 1:System.out.println("Add Dessert Items.");
					break;
			case 2:System.out.println("1.Candy--- 2.Cookie--- 3.IceCream");
					int chooseDI=sc.nextInt();
					switch (chooseDI)
					{
						case 1: System.out.println("Enter amount(Dollars):");
								int amt1=sc.nextInt();
								DessertItem cn =new Candy();
								cn.getCost(amt1);
								break;
						case 2:System.out.println("Enter amount(Euros):");
								int amt2=sc.nextInt();
								DessertItem co =new Cookie();
								co.getCost(amt2);
								break;
						case 3:System.out.println("Enter amount(Rupees):");
								int amt3=sc.nextInt();
								DessertItem ic=new IceCream();
								ic.getCost(amt3);
								break;
						default:System.out.println("Invalid Item");
					}
					break;
			default:System.out.println("Invalid Item Caught");
		}
	}
}

abstract class DessertItem{
	abstract public void getCost(int amt);
}

class Candy extends DessertItem{
	public void getCost(int amt)
	{
		System.out.println("Cost is "+amt*60+"Rs");
	}
}

class Cookie extends DessertItem{
	public void getCost(int amt)
	{
		System.out.println("Cost is "+amt*70+"Rs");
	}
}

class IceCream extends DessertItem{
	public void getCost(int amt)
	{
		System.out.println("Cost is "+amt+"Rs");
	}
}