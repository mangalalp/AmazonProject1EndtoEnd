package mdule1;

import java.util.Arrays;

public class ArrayRemoveDuplicate {

	public static void main(String[] args) {
		
		int [] Array=new int[7];
		
		Array[0]=2;
		Array[1]=3;
		Array[2]=3;
		Array[3]=1;
		Array[4]=4;
		Array[5]=1;
		Array[6]=5;
		
		Arrays.sort(Array);
		System.out.println(Arrays.toString(Array));
	
		int[] result=new int[Array.length];
		int j = 0;
		
		for(int i=0; i<Array.length-1;i++)
		{
			if(Array[i]!=Array[i+1])
			
				result[j++]=Array[i];
					
		}
		result[j++]=Array[Array.length-1];
		for (int i=0;i<j;i++)
		{
		
			System.out.print(result[i] + " ");
		
		}
	}
}
