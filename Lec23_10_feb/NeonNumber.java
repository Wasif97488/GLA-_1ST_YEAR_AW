package Lec23_10_feb;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sqrt = num*num;
		int sum=0;
		while(sqrt!=0)
		{
			int rem = sqrt%10;
			sum = sum+rem;
			sqrt=sqrt/10;
		}
		
		if(sum==num)
			System.out.println("Neon Number ");
		else
			System.out.println("Not a Neon Number");
	}
}
