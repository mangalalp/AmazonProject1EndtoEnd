package mdule1;

public class String_buffer_Builder {

	public static void main(String[] args) {
		String a="Mangala";//Immutable that can not change 
		String b=a.concat(" Patil");
		System.out.println(b);
		
		
		StringBuffer s1=new StringBuffer("Mangala"); //mutable
		s1.append(" Patil");
		System.out.println(s1);

		StringBuilder s2=new StringBuilder("Arjun"); //mutable
		s2.append(" Patil");
		System.out.println(s2);
	}

}
