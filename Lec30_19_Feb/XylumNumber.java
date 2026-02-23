package Lec30_19_Feb;

import java.util.Scanner;

public class XylumNumber {
	
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int num=sc.nextInt();
	  
	  int last = num%10;
	  int count=0;
	  int temp=num;
	  while(temp!=0)
	  {
		  count++;
		  temp=temp/10;
	  }
	  
	  int first = num/ (int)Math.pow(10, count-1);
//	  System.out.println(first+"  "+last);
	 num= num/10;
	 int middle=num%(int)Math.pow(10, count-2);
	 int sum=0;
	 while(middle!=0)
	 {
		 int rem=middle%10;
		 sum=sum+rem;
		 middle=middle/10;
	 }
	 
	 if(sum==(first+last))
		 System.out.println("xylum number");
	 else
		 System.out.println("Not xylum");
	 
	  
	}

}
