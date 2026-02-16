package mdule1;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector<Integer> v1= new Vector<Integer>();
		v1.add(12);
		v1.add(36);
		v1.add(65);
		v1.add(96);
		v1.add(45);
		System.out.println(v1.firstElement());
		
		System.out.println(v1);
		
		Enumeration <Integer>e1 =v1.elements();
		
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}

	}

}
