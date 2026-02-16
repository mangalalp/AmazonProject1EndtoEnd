package mdule1;

import java.util.Arrays;

public class ArrayProgramm2 {

	public static void main(String[] args) {
	//	WAP to check if the 2 arrays are equals
		int[] rollno1=new int[4];
		rollno1[0]=10;
		rollno1[1]=20;
		rollno1[2]=30;
		rollno1[3]=40;
		
		int[] rollno2=new int[4];
		rollno2[0]=10;
		rollno2[1]=20;
		rollno2[2]=30;
		rollno2[3]=40;
		
	//	int[] rollno2=new int[rollno1.length];
		/*for(int i=0; i<rollno1.length; i++ )
		{
			rollno2[i]=rollno1[i];
		*/
	//boolean b1=        Arrays.equals(array1, array2);
       // if(b1==true)
		//		if(Arrays.equals(array1, array2)==true)
			
		boolean b1 = Arrays.equals(rollno1, rollno2);
		if(b1)// if(true)  if(b1==true)  "    if(Arrays.equals(array1, array2))  
		{
			System.out.println("Both arrays are equal");
		}
		else 
		{
			System.out.println("Both arrays are not equal");
		}
		}

	 
	}


