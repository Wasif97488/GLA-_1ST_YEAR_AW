package Lec33_16_Mar;

import java.util.Scanner;

public class PositiveOrNegativeArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int pos=0,neg=0;
		for(int i=0;i<size;i++)
		{
			if(a[i]>0)
			{
				pos++;
			}
			else if(a[i]<0)
			{
				neg++;
			}
		}
		System.out.println("The Positive No count is: "+ pos+" And Negative COunt is: "+neg);
	}

}
