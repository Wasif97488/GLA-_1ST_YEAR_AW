package Lec38_23_Mar;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    
    System.out.println("Enter the element in an array");
    for(int i=0;i<size;i++)
    {
    	arr[i]=sc.nextInt();
    }
    
    System.out.println("Enter the element to be search:");
    int eleSear = sc.nextInt();
    
//    int count=0;
    boolean flag=false;
    int i=0;
    for(;i<size;i++)
    {
    	if(arr[i]==eleSear)
    	{
//    		count++;
    		flag=true;
    		break;
    	}
    }
    
    if(flag==true)
    	System.out.println(i);
    else
    	System.out.println(-1);
	}

}
