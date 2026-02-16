package mdule1;

import java.util.Arrays;

public class ArrayProgramming5 {
//WAP to check if String is Anagram
	public static void main(String[] args) {
		String a="was";
		String b="saw";
				
		/*		if(a.length()!=b.length())
				{
					System.out.println("they are not Anagram");
				}
		else */
		{
			 //in String there is no sort method is present so converting string to array
			char c1[]=a.toCharArray();
			char c2[]=b.toCharArray();
			
			 Arrays.sort(c1);
	            Arrays.sort(c2);
			//after sorting
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Strings are Anagram");
			}
			else 
			{
				System.out.println("Strings are not Anagram");
			}
		}
		

	}

}
