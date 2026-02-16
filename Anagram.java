package mdule1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a="saw";
		String b="was";
		
		char c1[]=a.toCharArray();
		char c2[]=b.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("given");
		}
		else
		{
			System.out.println("dfhh");
		}

	}

}
