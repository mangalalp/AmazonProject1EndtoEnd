package mdule1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListProperty3 {

	public static void main(String[] args) {
		
	List<String> l1    = new  ArrayList<String>();
	 l1.add("Mangala");
	 l1.add("mangala");
	 l1.add("Aryan");
	// l1.add("Lingaraj");
	// l1.add("Harsha");
	// l1.add("Mangala");
	// l1.add(null);
	 System.out.println(Collections.frequency(l1, "mangala"));
	 System.out.println(l1);
	 
	 ListIterator <String>i2	=l1.listIterator();
		System.out.println("Forward Iteration :");
		while(i2.hasNext())
		{
		System.out.println(i2.next());	
		}
		System.out.println("Backward Iteration :");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		}

	}


