package Java_Assignment4_WithdrawFunction;

public class SavingAccount
{
	long id;
	double balance =0;
	double amount;
	
	public void deposit(double amount)
	{
		System.out.println("--------------------------------------");
		System.out.println("Enter the Amount You Want To Deposit");
		balance = balance+amount;
	}
	public void withdraw(double amount) throws Exception
	{
		if(amount>balance)
		{
			throw new Exception("InsufficientBalanceException");
		}
		else if(amount>0)
		{
         throw new Exception("IllegalBankTransactionException"); 			
		}
		else 
		{
			balance = balance-amount;
			System.out.println("Balance After Withdrawal:" +balance);
		}
		
	}

}

