package mdule1;

class Child_programm{
	Child_programm (int a)
	{
		System.out.println("pre kg childern program");
	}
}

class Child_Programm2 extends Child_programm{
	Child_Programm2()
	
	{
		super(100);
		System.out.println("lkg children 2");
	}
}

class Child_Programm3 extends Child_Programm2 {
	Child_Programm3(String a, char b)
	{
		super();
		System.out.println("start programm");
	}
}
public class SuperCallingStament extends Child_Programm3 {
	SuperCallingStament()
	{  
		super("mangala",'m');
		System.out.println("state karanata");
	}
	

	public static void main(String[] args) {
		
new SuperCallingStament();
	}

}
