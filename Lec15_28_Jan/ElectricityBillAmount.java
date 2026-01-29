package Lec15_28_Jan;

import java.util.Scanner;
public class ElectricityBillAmount {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int unit = sc.nextInt();
		double amount;
		if(unit<=100)
			amount=unit*1.5;
		else if(unit>100 && unit <=200)
			amount=100*1.5+(unit-100)*2.5;
		else
			amount=100*1.5+100*2.5+(unit-200)*4;
		
		if(amount>500)
		{
			amount=amount*0.1+amount;
			System.out.println(amount);
		}
		else
		{
			System.out.println(amount);
		}
		
	}

}

