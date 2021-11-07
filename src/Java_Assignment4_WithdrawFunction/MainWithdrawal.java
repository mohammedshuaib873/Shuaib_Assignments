package Java_Assignment4_WithdrawFunction;

public class MainWithdrawal 
{
	public static void main(String[] args) 
	{
		SavingAccount sa = new SavingAccount();
		sa.deposit(1200);
		try {
			sa.withdraw(100);
		}catch(Exception e)
		{
			System.out.println("InsufficientBalanceException "+e);
		}
		
	}

}
