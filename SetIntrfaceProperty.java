package mdule1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIntrfaceProperty {

	public static void main(String[] args) {
		Set s1=new HashSet<Integer>();
		
		s1.add(25);
		s1.add(69);
		s1.add(58);
		s1.add(64);
		s1.add(21);
		
		System.out.println(s1);
		
		Iterator<Integer> i3=s1.iterator();
		
		while(i3.hasNext())
		{
			System.out.println(i3.next());
		}
		}

}
