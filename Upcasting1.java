package mdule1;

class casting{
	static void add()
	{
		System.out.println("after doing upcasting we can only access parent class property");
	}
	static void name()
	{
		System.out.println("This is super class method");
	}
	
}

public class Upcasting1 extends casting {


	public static void main(String[] args) {
		casting c1 =new Upcasting1();
		c1.add();
		c1.name();
		

	}

}
