package mdule1;

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("API Automation "); //mutable
		s1.append(" Testing");
		//System.out.println(s1);
	//System.out.println(s1.delete(4, 14));
		System.out.println(s1.replace(4, 14, "Manual"));
		
	
		
					StringBuffer s2=new StringBuffer("API Testing");
				System.out.println(s2.insert(3, " SDET"));

			//	System.out.println(s2.substring(4));

		System.out.println(s2.substring(4, 11));
			System.out.println(s2.reverse());
		System.out.println(s2.capacity());
			 s2.ensureCapacity(3);                   // ensures minimum capacity (no return value)
		       System.out.println( + s2.capacity());
		        
		     System.out.println(s2.charAt(0));
		     System.out.println(s2.length());

			}
	
	}


