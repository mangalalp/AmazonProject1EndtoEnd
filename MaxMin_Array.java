package mdule1;

import java.util.Arrays;

public class MaxMin_Array {

	public static void main(String[] args) {
		//WAP to find out out of many values present in Array which is maximum and which is minimum
		int array[]=new int[4];
		array[0]=10;
		array[1]=5;
		array[2]=25;
		array[3]=1;
		System.out.println(Arrays.toString(array));
		
		int min=array[0]; //assume we do not know min value in given array so assume
		int max=array[0];//assume we do not know max value in given array so assume
		for(int i=0; i<array.length; i++)
		{
			if(array[i]>max)
			{
				max=array[i];
				
			}
		
		if(array[i]<min)
		{
			min=array[i];
		}
	
		}
		System.out.println(max);
		System.out.println(min);

}
}
