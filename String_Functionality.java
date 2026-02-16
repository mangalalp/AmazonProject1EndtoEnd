package mdule1;

public class String_Functionality {

	public static void main(String[] args) {
		String b="indian nationality";
		String c= b.substring(3, 6);
		//String c= b.substring(3);
		System.out.println(c);
System.out.println(c);
  boolean b1= b.equals("Indian Nationality");
 System.out.println(b1);
  
 String name="Mangala Lingaraj Patil";
 
boolean b2= name.contains("Lingaraj");
System.out.println(b2);

String l="Indian";
//check if the string starts with I
  boolean k1=l.matches("I(.*)");
System.out.println(k1);
//check if the string ends with n
boolean k2=l.matches("(.*)n");
System.out.println(k2);

//check if the string has exact 6 letters
 boolean n1=l.matches("......");
 System.out.println(n1);
//check if String has https in it or not
 String url="https://www.google.com";
		boolean n= url.matches("https(.*)");
		System.out.println(n);
	}

}
