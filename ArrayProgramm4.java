package mdule1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgramm4 {

	//"WAP to find out the average values which is present in array
				
	public static void main(String[] args) {
		 Scanner s1 = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");

	        double[] Salary = new double[s1.nextInt()];

	        double sum = 0;

	        System.out.println("Enter  salary values:");
	        for (int i = 0; i < Salary.length; i++) {
	            Salary[i] = s1.nextDouble();
	            sum = sum + Salary[i];
	        }

	        double Average = sum / Salary.length;

	        System.out.println("Salaries: " + Arrays.toString(Salary));
	        System.out.println("Average Salary: " + Average);

	        s1.close();
	    }
	
	
	

	}


