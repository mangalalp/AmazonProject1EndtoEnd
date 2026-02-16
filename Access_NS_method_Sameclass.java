package mdule1;

public class Access_NS_method_Sameclass {
	
	static void student()
	{
		System.out.println("students have exam");
		
	}
	
	void teachers()
	{
		System.out.println("teachers conducting exam");
	}
	
	void school()
	{
		System.out.println("vacations tsarted");
	}

	public static void main(String[] args) {
		student();
		Access_NS_method_Sameclass a1=new Access_NS_method_Sameclass();
		a1.teachers();
		a1.school();
		
		
		
		

	}

}
