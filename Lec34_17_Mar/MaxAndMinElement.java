package Lec34_17_Mar;

import java.util.Scanner;

public class MaxAndMinElement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		int max=a[0], min=a[0];
		
		for(int i=1;i<size;i++)
		{
			if(a[i]>max)
				max=a[i];
			
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("The Max element is :"+max +" the min element is: "+min);
	}

}
