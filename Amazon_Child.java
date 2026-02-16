package mdule1;

class Amazon_GParent
{
	Amazon_GParent(String a,char b)
	{
		System.out.println("Statement 3");
	}
}
class Amazon_Parent extends Amazon_GParent
{
	Amazon_Parent(int a)
	{
		super("MKT",'I');
		System.out.println("Statement 1");
	}
}

public class Amazon_Child extends  Amazon_Parent{
	
		Amazon_Child()
		{
		super(100);
			System.out.println("Statement 2");
		}

	public static void main(String[] args) {
		{
			new Amazon_Child();
	}
		

	}

}
