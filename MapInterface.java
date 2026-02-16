package mdule1;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<Integer,String> m1=	new HashMap<Integer,String>();
		m1.put(256365, "Mangala");
		m1.put(256859, "Kinjal");
		m1.put(256345, "mansh");
		m1.put(257365, "Aryan");
		m1.put(252365, "Arjun");
		m1.put(253365, "Lingaraj");
		
		System.out.println(m1);
		Map<Integer,String> m2=	new HashMap<Integer,String>();
		m2.put(256365, "Mangala");
		m2.put(256859, "Kinjal");
		m2.put(256345, "mansh");
		m2.put(257365, "Aryan");
		m2.put(252365, "Arjun");
		m2.put(253365, "Lingaraj");
		boolean b1=m1.equals(m2);
		System.out.println(b1);
	//System.out.println(m1.equals(m2));

	}

}
