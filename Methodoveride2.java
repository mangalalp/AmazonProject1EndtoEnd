package mdule1;

class Teacher1{
	void student()
	{
		System.out.println("teacher is teaching lession");
	}
	//parent class is overriden by child class
}
public class Methodoveride2 extends Teacher1 {
	void student()
	{
		System.out.println("students are learning things");
	}
	void student1()
	{
		System.out.println("students are making noise");
	}

	public static void main(String[] args) {
		Methodoveride2 t1=new Methodoveride2();
				t1.student1();
		t1.student();
		t1.student();

	}

}
