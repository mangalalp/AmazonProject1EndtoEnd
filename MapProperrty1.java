package mdule1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapProperrty1 {

	public static void main(String[] args) {
	Map<Integer, String>	m1=new HashMap<Integer, String>();
	m1.put(659325, "Skiert");
	m1.put(456329, "short");
	m1.put(659348, "pant");
	m1.put(41785, "top");
	m1.put(6541236, "chudidar");
	m1.put(63789, "leggin");
	
	/*boolean b1=m1.containsKey(63789);
	System.out.println(b1);
	boolean b2=m1.containsValue("pant");
	System.out.println(b2);
	
	System.out.println(m1);
	m1.clear();
	System.out.println(m1);
	*/
	Set<Integer>s1=m1.keySet();
	System.out.println("Iterating the keys :");
	for(      Integer i1          : m1.keySet())// only for keys

	{
		System.out.println(i1);
	}
	Collection<String> c1=m1.values();
	System.out.println("Iterating the values :");
	for(  String s2       : m1.values())//only for values
	{
		System.out.println(s2);
	}
	Set<Entry<Integer, String>>e2=m1.entrySet();
	System.out.println("Iterating the keys and values :");
	for(Entry<Integer, String> e3:        m1.entrySet())//both keys and values
	{
		System.out.println(e3);
	}
	Iterator<Entry<Integer, String>>s7=	e2.iterator();
	System.out.println("Iterating the keys and values using iterator :");
	while(s7.hasNext())
	{
		System.out.println(s7.next());
	}
	
	}

}