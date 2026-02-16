package mdule1;

class Arjun{
	
static void property1()
{
	System.out.println("take property from grand parent");
}
	}
class Aryan extends Arjun {
	static void property2()
	{
		System.out.println("fetch the property fro pernts");
	}
}

public class Hem_Inherit extends Aryan{

	public static void main(String[] args) {
		 property1();
		 property2();
	}

}
