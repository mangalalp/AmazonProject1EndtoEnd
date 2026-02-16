
package mdule1;

public class SIBIIB {
	SIBIIB(){
		System.out.println("this is constructor");
	}
	
	static
	{
		System.out.println("SIB will execute first");
	}
	static
	{
		System.out.println("this is SIB");
	}
	{
		System.out.println("IIB will execute third");
	}
	{
		System.out.println("this is IIB1");
	}
	{
		System.out.println("this is IIB1");
	}

	public static void main(String[] args) {
		
System.out.println("main method will execute 2nd ");
new SIBIIB ();
new SIBIIB ();
	}

}
