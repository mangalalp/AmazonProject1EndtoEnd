package mdule1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		try {
				Scanner s1=new Scanner(System.in);
				System.out.println("please enter the size of array:");
				int age[]=new int[s1.nextInt()];
				age[0]=41;
				age[1]=41;
				age[2]=41;
				System.out.println(Arrays.toString(age));
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("Handled the exception 1");
		}
		
		catch(NegativeArraySizeException a2)
		{
			System.out.println("please enter the size of array , this time please make sure its not negative"); //developer can expect the human input at runtime at this point also
			try {
			Scanner s1=new Scanner(System.in);
			int age[]=new int[s1.nextInt()];
			age[0]=41;
			age[1]=41;
			age[2]=41;
			System.out.println(Arrays.toString(age));
		}	
			catch(NegativeArraySizeException a5)
			{
				System.out.println("exception hanlded");
			}
		catch(InputMismatchException a4)
		{
			
		}
				
			}
	}
}


