package mdule1;

class User {
    void login() {
        System.out.println("Login with OTP sent to mobile");
    }
}

class Mangala extends User {
 
    void login() {
        System.out.println("Login with Employee ID and password");
    }
}
// depending on custemer choices either child calss object created or parent class object ceated
class Admin extends User {
    void login() {
        System.out.println("Login with Username and Password");
    }
}

public class RT_Polymorphism extends User {
	void login()
	{
		System.out.println("Login with mobile no");
	}

	public static void main(String[] args) {

		User u = new User();
        u.login();

        User u1 = new Mangala();  // upcasting
        u1.login();

        User u2= new Admin();    // upcasting
        u.login();
        User u3=new RT_Polymorphism();
      u.login();

	}

}
