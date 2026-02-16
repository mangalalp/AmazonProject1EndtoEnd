package mdule1;

import java.util.Arrays;
public class ArrayProgramming6 
{
  static int noofAlphabets=0;
  static int noofnumeric=0;
  static int noofSpaces=0;
  static int noofSpecialchar=0;
	public static void main(String[] args) {
		
		String input="PAN  no XXX365;";
		
		char c1[]=input.toCharArray();
		
		for(int i=0; i<c1.length; i++)
		{
			boolean b1= Character.isAlphabetic(c1[i]);
			if (b1==true)
			{
				noofAlphabets++;
			}
			boolean b2= Character.isDigit(c1[i]);
			if (b2==true)
			{
				noofnumeric++;
			}
			boolean b3= Character.isWhitespace(c1[i]);
			if (b3==true)
			{
				noofSpaces++;
			}
		}
		System.out.println(Arrays.toString(c1));
		System.out.println(noofAlphabets);
		System.out.println(noofnumeric);
		System.out.println(noofSpaces);
		noofSpecialchar= input.length()-(noofAlphabets+noofnumeric+noofSpaces);
		System.out.println(noofSpecialchar);
		

	}

}
