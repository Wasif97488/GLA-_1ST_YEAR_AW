package Lec17_30_Jan;

import java.util.Scanner;

public class ATMMachine {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1: for Deposit");
		System.out.println("2: for Withdraw");
		System.out.println("3: for Check Balance");
		int choice=sc.nextInt();
		double balance=6000;
		switch(choice)
		{
		case 1: 
		{
			System.out.println("Enter the Deposit Amount");
			double deposit=sc.nextDouble();
			if(deposit>0)
			{
			balance=balance+deposit;
			System.out.println("The Final Balance:"+balance);
			}
			else
			{
				System.out.println("Invalid deposited Amount");
			}
		}
		break;
		case 2: 
		{
			System.out.println("Enter the Withdraw Amount");
			double withdraw=sc.nextDouble();
			if(withdraw>0)
			{
				if(balance-withdraw>=2000)
				{
					balance=balance-withdraw;
					System.out.println("The Final Amount :"+balance);
				}
				else
				{
					System.out.println("Insufficient Amount ");
				}
			}
			else
			{
				System.out.println("Invalid Withdraw Amount");
			}
		}
		break;		
		case 3: System.out.println("Balance amount is "+balance);
		}


	}

}
