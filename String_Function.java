package mdule1;

public class String_Function {

	public static void main(String[] args) {
	 String a="Automation Testing";
   String	b= a.replace('t', 'T');
   System.out.println(b);
   
   String c="Patil";
   String n=c.replace("Patil", "Jaya Patil");
   System.out.println(n);
   //replace all numeric value
   String a1="Grotechminds  123456";
   String a2=a1.replaceAll("[0-9]", "Mangala");
   
   System.out.println(a2);
   //replace all smaller letters
   String a3=a1.replaceAll("[a-z]", "3");
   System.out.println(a3);
   
   //replace all capital letter
   
   String a4=a1.replaceAll("[A-Z]", " ");
  System.out.println(a4);
	}

}
