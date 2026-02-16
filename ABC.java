package mdule1;

public class ABC {

	public static void main(String[] args) {
		String Input= "Mangala";
		String output="";
		
		for(int i=Input.length()-1;i>=0;i--)
		{
			char c1=Input.charAt(i);
					output=output+c1;
		}
		if(Input.equals(output))
		{
			System.out.println("given string is palindome");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
	}

}
