package mdule1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPgm7 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Mangala");
		a1.add("Arjun");
		a1.add("Aryan");
		a1.add("Harsha");
		a1.add("Lingaraj");
		a1.add("rani");
	System.out.println(Collections.binarySearch(a1, "Rani"));
		
	
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println("After Sorting->"+a1);
		Collections.reverse(a1);
		System.out.println("After Sorting->"+a1);
		
		a1.remove(2);
		System.out.println("removing from index "  +a1);
		
		a1.remove("Harsha");
		System.out.println("removing the object " +a1);
		
		a1.clear();
		System.out.println(a1);
		
		

	}

}
