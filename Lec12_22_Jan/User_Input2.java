package Lec12_22_Jan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User_Input2 {
	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		int a=Integer.parseInt(s);
		System.out.println(a);
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int b= Integer.parseInt(br.readLine());
		System.out.println(b);
	}

}
