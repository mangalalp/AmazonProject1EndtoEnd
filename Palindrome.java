package mdule1;

public class Palindrome {

	public static void main(String[] args) {
	 String a="mangala";
	 String b="";
	 
	 for(int i=a.length()-1; i>=0;i--)
	 {
		 char c1=a.charAt(i);
		 b=b+c1;
	 }
if(a.equals(b))
{
	System.out.println("djfh");
	
}
else
{
	System.out.println("djfj");
}
	}

}
