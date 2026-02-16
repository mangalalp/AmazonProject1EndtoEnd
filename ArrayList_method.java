package mdule1;

import java.util.ArrayList;

public class ArrayList_method {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(365);
		a1.add(250);
		a1.add(219);
		a1.add(500);
		a1.add(100);
		a1.add(2, 258);
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		System.out.println(a1.contains(600));
		
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(200);
		a2.add(150);
		a2.add(500);
		a2.add(99);
		a2.add(175);
		a2.addAll(2, a2);
		System.out.println(a2);
		System.out.println(a2.containsAll(a1));
		a2.addAll(a1);
		a2.addAll(0, a1);
		System.out.println(a2);
		a2.removeAll(a1);
		System.out.println(a2);
		

	}

}
