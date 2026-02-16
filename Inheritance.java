package mdule1;

class Student{
	void add() {
		int a=18;
		if(a<18)
		{
			System.out.println("person can not vote");
		}
		else
		{
			System.out.println("person can vote");
		}
	}
}

 class Inheritance extends Student {
	 static void login()
	 {
		 System.out.println(" loging with UN and PW");
	 }
	 
	 static void logout()
	 {
		 System.out.println("logout with valid Credentials");
			
		}
	 
	public class Inheritance1 extends Inheritance {
		//static method
		//non static method
		
	}
	public static void main(String[] args) {
		login();
		logout();
		
		Inheritance t1=new Inheritance();
		t1.add();
		
	}
		
	}


