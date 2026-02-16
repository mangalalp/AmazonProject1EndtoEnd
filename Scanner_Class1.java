package mdule1;

import java.util.Scanner;


public class Scanner_Class1 {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		         String a= s1.next();
		         System.out.println(a);
		    Byte b=  s1.nextByte();
		    System.out.println(b);
		    Double d=  s1.nextDouble();
		    System.out.println(d);
		    Float f=   s1.nextFloat();
		    System.out.println(f);
		    Boolean b1=  s1.nextBoolean();
		    System.out.println(b1);
		     int i=   s1.nextInt();
		     System.out.println(i);
		    long l=   s1.nextLong();
		    System.out.println(l);
		     short s=   s1.nextShort();
		     System.out.println(s);
		     
		     s1.close();
		     
		          

	}

}
