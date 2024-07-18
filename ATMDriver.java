
class ATMDriver
{
	public static int generateOtp()throws InterruptedException // generating otp
	{
		System.out.print("Generating otp");
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(1000);
			System.out.print(".");
		}
		System.out.println();
		java.util.Random r = new java.util.Random();
		int random = r.nextInt(1000,10000);
		return random;
		/*int min = 1000;
		int max = 10000;

		int otp = (int)Math.random()*(max-min)+min;*/

		//return otp;
	}

	public static void main(String[] args)throws InterruptedException 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		boolean b = true;
		while(b)
		{
			System.out.println("*********************");
			System.out.println("1.Withdraw");	
			System.out.println("2.Deposit");
			System.out.println("3.Check Balance?");
			System.out.println("4.Exit");
			System.out.println("*********************");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("How much ??");
					double amount = sc.nextDouble();
					System.out.println();
					int generated_otp = generateOtp();
					System.out.println("Your otp is :"+generated_otp);
					System.out.print("Enter otp :");
					int otp = sc.nextInt();
					if(otp==generated_otp)
							ATM.withdraw(amount);
					else 
						System.out.println("Invalid otp");
				}break;

				case 2:
				{
					System.out.println("How much??");
					double amount = sc.nextDouble();
					ATM.deposit(amount);
				}break;

				case 3:
				{
					ATM.checkBalance();
				}break;

				case 4:
				{
					b = false;
				}break;

				default :
				{
					System.out.println("Invalid option");
				}
			}
		}

		System.out.println("Thank you for your patience please visit again!!!!....");
	}
}