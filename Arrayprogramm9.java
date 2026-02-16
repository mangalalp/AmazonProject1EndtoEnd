package mdule1;

import java.util.Arrays;

public class Arrayprogramm9 {

	public static void main(String[] args) {
		//WAP to check if the given number is present in the array input[1,2,3,40,90,5] user input=5Output=>the given number is present in the array
		
		int array[]=new int[5];
		array[0]=510;
		array[0]=550;
		array[0]=480;
		array[0]=240;
		array[0]=360;
		array[0]=500;
		array[0]=750; //for understanding this is how to update the value of a array at any index
		array[1]=55;
		array[2]=150;
		array[3]=560;
		array[4]=600;
		 int noTocheck=150;
		 System.out.println(Arrays.toString(array));
		 
		 for(int i=0; i<array.length; i++)
		 {
			 if (array[i]==noTocheck)
			 {
				 System.out.println("the given no is part of the array, at index position -->>" +i);
			 }
		 }
			 
		
		

	}

}
