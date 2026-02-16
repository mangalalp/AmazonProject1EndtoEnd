package mdule1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Iterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(25);
		a1.add(21);
		a1.add(9);
		a1.add(7);
		a1.add(20);
		
		Iterator<Integer>i1=a1.iterator();
		System.out.println("iteration using iterator");
		System.out.println("Forward iteration using->ListIterator :");
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		ListIterator<Integer> i2=	a1.listIterator();
		System.out.println("iteration using iterator");
		System.out.println("Forward iteration using->ListIterator :");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("iteration using iterator");
		System.out.println("Backword iteration using->ListIterator :");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}

	}

}
