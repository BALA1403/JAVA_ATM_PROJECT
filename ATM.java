class ATM
{
	static double balance; // static variable declared

	static //static multiline intializer
	{
		balance = 1000d;
	}

	public static void withdraw(double amount)
	{
		if(amount<=0)
		{
			System.out.println("Invalid amount!!");
		}
		else 
		{
			if(amount%500==0 && amount<=balance)
			{
				System.out.println(amount+" withdrawn successfully...");
				balance-=amount; // updating balance
				System.out.println("Updated balance is :"+balance);
			}
			else 
			{
				if(amount>balance)
					System.out.println("Insufficient balance");
				else 
					System.out.println("Sorry!!..Amount must be in multiples of 500");
			}
		}
	}

	public static void deposit(double amount)
	{
		if(amount>0 && amount%100==0)
		{
			System.out.println(amount+" deposited successfully ...");
			balance+=amount; // updating balance
			System.out.println("Updated balance is :"+balance);
		}
		else 
		{
			System.out.println("Invalid amount....");
		}
	}

	public static void checkBalance()
	{
		System.out.println("Your balance is :"+balance);
	}
}