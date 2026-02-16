package mdule1;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceProperty {

	public static void main(String[] args) {
		Map<Integer,String> m1=	new HashMap<Integer,String>();
		m1.put(256365, "Mangala");
		m1.put(256859, "Kinjal");
		m1.put(256345, "manish");
		m1.put(257365, "Aryan");
		m1.put(252365, "Arjun");
		m1.put(253365, "Lingaraj");
		m1.put(258689, "Reena");
		m1.replace(256345, "manish", "reyansh");
		m1.replace(258649, "Sonu");
		
		m1.putIfAbsent(2569846, "Madhu");
		
		System.out.println(m1);
		
	System.out.println(m1.get(258689));
		
		m1.remove(257365);
		m1.remove(253365, "Lingaraj");
		
		System.out.println(m1);
		System.out.println(m1.isEmpty());
		
		Map<Integer,String> m2=	new HashMap<Integer,String>();
		m2.put(365498, "Harsha");
		m2.putAll(m1);
		System.out.println(m2);

	}

}
