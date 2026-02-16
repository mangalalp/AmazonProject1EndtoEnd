package mdule1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Finallyexception {

	public static void main(String[] args) {
		
			try {
				Scanner s1=new Scanner(System.in);
				System.out.println("Please enter the size of the array:");
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
				System.out.println("Please enter the size of the array , this time please make sure its not -ve");
				
			}	
			catch(InputMismatchException a3)
			{
				System.out.println("Handled the excepti");
			}	
			finally
			{
				System.out.println("Finally block");
			}
					
			}
	}


