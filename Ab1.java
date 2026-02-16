package mdule1;

	abstract class Ab3 //100 % abstraction
	{
		abstract void teacher1();
		abstract void teacher2();
	}
	abstract class Ab2 extends Ab3 //100 % abstraction
	{
		abstract void student1();
		abstract void student2();
	}
	public class Ab1 extends Ab2
	{
		void teacher1()
		{
			System.out.println("Real Logic of Add will be here");
	}
	void teacher2()

	{
		System.out.println("Real Logic of Add will be here");
	}
	void student1()

	{
		System.out.println("Real Logic of Add will be here");
	}
	void student2()
	{
		System.out.println("Real Logic of Add will be here");	
	}
	public static void main(String[] args) {
	
		Ab1 l1=new Ab1();
		l1.teacher1();
		l1.teacher2();
		
		

	}

}
	
