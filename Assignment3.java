package assignments;

public class Assignment3 {
	static void add()
	{
		System.out.println("it is raining");
		
	}
	static void method1()
	{
		System.out.println("it is too hot");
		add();
	}

	public static void main(String[] args) {
		{
			System.out.println("Main method");
		}
		
		method1();
		add();
	}

}
