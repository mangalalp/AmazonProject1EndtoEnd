package mdule1;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethods {

	public static void main(String[] args) {
		ArrayList<Integer>	l1	=new ArrayList<Integer>();
		l1.add(36);
		l1.add(50);
		l1.add(90);
		l1.add(25);
		l1.add(5);
		l1.add(45);
		
		
		System.out.println(l1);

		Collections.sort(l1);
		
		System.out.println("After sorting --->" +l1);
		Collections.reverse(l1);
		System.out.println("After Reversing --->" +l1);
		System.out.println("Minimum value from list-->"+Collections.min(l1));
		System.out.println("Maximum value from list -->"+Collections.max(l1));
		
		Collections.shuffle(l1);
		System.out.println("Shuffled values -->" +l1);
		
	int freq=	Collections.frequency(l1, 50);
		System.out.println("frequency-->" +freq);
		
		Collections.sort(l1);
		int l2=Collections.binarySearch(l1, 90);
		System.out.println("binarysearch of 90-->" +l2);
		Collections.rotate(l1, 2);
		
		System.out.println("Rotated form-->"+ l1);
		
		
		
		


	}

}
