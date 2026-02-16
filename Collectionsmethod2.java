package mdule1;

import java.util.ArrayList;
import java.util.Collections;

public class Collectionsmethod2 {

	public static void main(String[] args) {
		ArrayList<Integer>	list=new ArrayList<Integer>();
		list.add(65);
		list.add(40);
		list.add(93);
		list.add(80);
		list.add(12);
	
		ArrayList<Integer>	list1=new ArrayList<Integer>();
		list1.add(600);
		list1.add(300);
		list1.add(540);
		list1.add(200);
		list1.add(100);
		
		
		//Collections.fill(list, 100);
		
		System.out.println("list after filling the value -->"+list);

		Collections.replaceAll(list, 12, 21);
		System.out.println("after replcaing value-->"+list);
		
		Collections.copy(list, list1);
		System.out.println(list);
		
		System.out.println(Collections.disjoint(list, list1));
	}

}
