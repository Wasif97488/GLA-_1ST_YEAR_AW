package Lec32_13_Mar;

import java.util.Scanner;

public class SwapFirstAndLastElement {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int[] a = new int[size];
	
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	
	// first and last element
//	int first = a[0];
//	int last = a[size-1];
	int temp;
	//swap 
	temp=a[0];
	a[0]=a[size-1];
	a[size-1]=temp;
	
	//print 
	for(int i=0;i<size;i++)
	{
		System.out.println(a[i]);
	}
	}

}
