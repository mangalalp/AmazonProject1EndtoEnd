package mdule1;

class admission{
	void student()
	{
		System.out.println("admission are open");
	}
}
public class SuprKeyword extends admission {
	void student()
	{
		System.out.println("students are learning thinfs");
	}
	void student1()
	{
		System.out.println("students are making nose");
	
 super.student();//
 
	}
	public static void main(String[] args) {
		
		SuprKeyword t1= new SuprKeyword();
		t1.student();
		t1.student1();
	}
	}

