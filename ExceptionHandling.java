package mdule1;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
		int c=10/0; //  a/b  a from parent class and b from grand parent class
		
		System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Exception Handling");
		}

	}

}
