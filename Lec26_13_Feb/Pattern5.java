package Lec26_13_Feb;

public class Pattern5 {
	
	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			//task 1
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			//task 2 
			for(int k=n-i;k>=0;k--)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
			
		}
	}

}
