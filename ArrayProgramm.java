package mdule1;

import java.util.Arrays;

public class ArrayProgramm {

	public static void main(String[] args) {
	//	WAP to copy the value of one array into another array 
	//	(Input=[1,2,3,4,5]
		//Output=[1,2,3,4,5])	
		
		int[] rollno1=new int[4];
		rollno1[0]=10;
		rollno1[1]=20;
		rollno1[2]=30;
		rollno1[3]=40;
		
		int[] rollno2=new int[rollno1.length];
	/*	rollno2[0]=rollno1[0];
		rollno2[1]=rollno1[1];
		rollno2[2]=rollno1[2];
	*/	rollno2[3]=rollno1[3];
	
	for(int i=0; i<rollno1.length; i++ )
	{
		rollno2[i]=rollno1[i];
	}
	System.out.println("input array is : ----");
System.out.println(Arrays.toString(rollno1));	
System.out.println("output array is : ----");
System.out.println(Arrays.toString(rollno2));

	}

}
