
package mdule1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Countno {
	static int countvalues=0;
	public static void main(String[] args) 
	{
		{
			 Scanner s1 = new Scanner(System.in);
		int array[]=new int[5];
		array[0]=750; //for understanding this is how to update the value of a array at any index
		array[1]=55;
		array[2]=150;
		array[3]=600;
		array[4]=600;
		System.out.println(Arrays.toString(array));
		System.out.println("eneter value to search no present in array");
		 int noTocheck= s1.nextInt();
		 
		 for(int i=0; i<array.length; i++)
		 {
			 if (array[i]==noTocheck)
			 {
				 System.out.println("the given no is part of the array, at index position -->>" +i);
				 countvalues++;
			 }
		 }
			 
		System.out.println("count of value repeated  -->>" +countvalues);
	}
}	
	}


