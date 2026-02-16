package mdule1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgramm3 {

	public static void main(String[] args) {
	/*	WAP to copy the value of one array into another array in reverse order

		Input=[1,2,3,4,5]
		Output=[5,4,3,2,1]		*/
System.out.println("Enter the values of salary");
		
		int [] Salary=new int[4];
	    Salary[0]=10;
		Salary[1]=20;
		Salary[2]=30;
		Salary[3]=40; 
			
		
		int[] Salary2=new int[Salary.length];
		for(int i=0,k=Salary.length-1; i<Salary.length; i++, k--)
		{
			
			Salary2[k]=Salary[i];
		}
		System.out.println("Input of Salary is-->");
		System.out.println(Arrays.toString(Salary));
		System.out.println("output of Salary is-->");
		System.out.println(Arrays.toString(Salary2));
		
		

	}

}
