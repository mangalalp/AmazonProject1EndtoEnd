package mdule1;

public class Type_Casting {

	public static void main(String[] args) {
		//convert byte into int
		
		byte a=10;
		int i=(int)a;
		
 System.out.println(i);
 
 //convert int into byte(narrowing)
 
 int c=1000;
 byte d=(byte)c;
 System.out.println(d);
 
 //convert float into double(widening)
 
 float f=25.5f;
 double s=f;
 System.out.println(s);
 
 //convert double into byte(narrowing)
 
 double l=35.5;
 byte k=(byte)l;
 System.out.println(k);
	}

}
