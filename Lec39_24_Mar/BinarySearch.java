package Lec39_24_Mar;

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the size of an array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("ENter the element in an array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searchg");
		int search = sc.nextInt();
		
		
		int start=0;
		int end= size-1;
		
		while(start<=end)
		{
			int mid= start+(end-start)/2;
			if(arr[mid]==search)
			{
				System.out.println(mid);
			break;
			}
			else if(arr[mid]>search)
				end=mid-1;
			else 
				start=mid+1;
		}
		
	}

}
