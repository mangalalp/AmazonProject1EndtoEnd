package mdule1;

public class This_Keyword {

	int TeacherId;
	double Salary;
	String Name;
	
	void School(int Tid, double Money, String Tname)
	{
		this.TeacherId=Tid;
		this.Salary=Money;
		this.Name=Tname;
	/*	System.out.println("Teacher Id is: "+TeacherId);
		System.out.println("Teacher Salary  is: "+Salary);
		System.out.println("Teacher name is: "+Name);*/
		
	}
	
	public static void main(String[] args) {
		 This_Keyword t1=new  This_Keyword();
		 t1.School(20, 20000, "Mangala");
		 System.out.println(t1.Name);
		 System.out.println(t1.Salary);
		 System.out.println(t1.TeacherId);
		

	}

}
