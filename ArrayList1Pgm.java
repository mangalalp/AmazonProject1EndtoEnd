package mdule1;

import java.util.ArrayList;

public class ArrayList1Pgm {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Mangala");
		a1.add("Arjun");
		a1.add("Aryan");
		a1.add("Harsha");
		a1.add("Lingaraj");
		
		System.out.println(a1);
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Mangala");
		a2.add("Arjun");
		a2.add("Aryan");
		a2.add("Harsha");
		a2.add("Lingaraj");
		
		System.out.println(a2);
		
	String s1=	a1.get(1);
		System.out.println(s1);
		System.out.println(a1.size());
		
	boolean answer=	a1.equals(a2);
	System.out.println(answer);

	}

}
