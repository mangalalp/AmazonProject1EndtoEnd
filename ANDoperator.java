package mdule1;

public class ANDoperator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		if(a>=10&& b==20)
		{
			System.out.println("both statement will execute");
		}
		if(a>=10&& b==30)
		{
			System.out.println("one is true, second is false");
		}
		if(a>=20&& b==20)
		{
			System.out.println("one is true, second is false");
		}
		if(a>=30 && b==30)
		{
			System.out.println("will not get output");
		}
	}

}
