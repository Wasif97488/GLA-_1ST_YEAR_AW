package Lec28_17_Feb;

public class ButterflyPattern {
	
	public static void main(String[] args) {
		int star=0;
		int n=5;
		for(int i=1;i<=2*n-1;i++)
		{
			//mirror condition
			if(i<=n)
			star=i;	
			else
				star--;
			
			
			
			//task 1 star
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			
			//task 2 space
			for(int k=2*(n-star)-1;k>=1;k--)
			{
				System.out.print(" ");
			}
			
			//task 3 star
			for(int l=1;l<=star;l++)
			{
				if(l==n)
					break;
				System.out.print("*");
			}
			
			System.out.println();
			
			
		}
	}

}
