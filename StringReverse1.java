package mdule1;

public class StringReverse1 {
	//WAP to check if the given String is a palindrome

	public static void main(String[] args) {
		String input="detartrated";
	   String output="";
	           //Reverse the string                                             
	   for (int i=input.length()-1; i>=0; i--)
	   {
		   char c1=input.charAt(i);
		   output=output+c1;
	   }
	   System.out.println("input is->  "+input);
	   System.out.println("output is->  "+output);
	   
	   if(input.equals(output))
	   {
		   System.out.println("The given string is palandrome");
	   }
	   else
	   {
		   System.out.println("Not a paldrome");
	   }
	}
}
	

	






