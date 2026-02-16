package mdule1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListProperty {

	public static void main(String[] args) {
		List l1= new ArrayList();
		l1.add(false);
		l1.add("mangala");
		l1.add(11);
		l1.add('s');
		System.out.println(l1);
		
	ListIterator i2	=l1.listIterator();
	System.out.println("Forward Iteration");
	while(i2.hasNext())
	{
	System.out.println(i2.next());	
	}
	System.out.println("Backward Iteration");
	while(i2.hasPrevious())
	{
		System.out.println(i2.previous());
	}
	}

}
