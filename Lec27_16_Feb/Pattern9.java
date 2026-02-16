package Lec27_16_Feb;

public class Pattern9 {
	
	public static void main(String[] args) {
		
		int n = 5;
		int star=0;
		for(int i=1;i<=2*n-1;i++)
		{
			//mirror condition
			
			if(i<=n)
			{
				star=i;
			}
			else
			{
				star--;
			}
			
			
		//task 1 
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}

}
