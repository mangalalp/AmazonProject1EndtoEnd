package mdule1;

import java.util.Scanner;

public class For_Loop5 {
	//WAP to do addition of 2 number from 10 student

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		for(int i=1; i<=10; i++)
		
		{

			
			int a= s1.nextInt();
			int b=s1.nextInt();
			int add=a+b;
					
			
			 System.out.println("Addition = " + add);
			s1.close();
		
		}
	}
}
