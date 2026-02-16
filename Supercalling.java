package mdule1;


class Gparent{
	Gparent()
	{
		System.out.println("statement1");
	}
}
class	Parent extends Gparent{
Parent()
{
	//super();
	System.out.println("addiyon");
}
}

public class Supercalling extends Parent{
	Supercalling()
	{
		System.out.println("substarction");
	}


	public static void main(String[] args) {
		
   new Supercalling();
	}
}


