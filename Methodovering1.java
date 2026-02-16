package mdule1;


class Parent1
{
	void login()
	{
		System.out.println("enter 10 digit no");
	}
}
public class Methodovering1  extends Parent1{
	void login()
	{
		System.out.println("enter valid email id");
	}

	public static void main(String[] args) {
		
		Methodovering1 t1=new Methodovering1();
		t1.login();
		
	}

}
