package mdule1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		//WAP to assign the value of Array at run time
		System.out.println("Enter the value of array");
		Scanner s1=new Scanner (System.in);
		
		int [] rollno=new int[s1.nextInt()];
		for(int i=0; i<rollno.length; i++)
		{
			rollno[i]=s1.nextInt();	
			System.out.println(Arrays.toString(rollno));}
		
	/*	rollno[0]=s1.nextInt();
		rollno[1]=s1.nextInt();
	*/	rollno[2]=s1.nextInt();
	
		
		System.out.println(Arrays.toString(rollno));
		s1.close();
		
	}

}
