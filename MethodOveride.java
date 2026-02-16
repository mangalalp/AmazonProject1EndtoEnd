package mdule1;

class MethodParent{
	void login()
	{
		System.out.println("login with valid credentials");
	}
}

public class MethodOveride extends MethodParent {
	void login()
	{
		System.out.println("enter mobile no");
		super.login();
	}

	public static void main(String[] args) {
		MethodOveride t1=new MethodOveride();
	t1.login();
		//MethodParent t1=new MethodParent(); only one mwthod will execute as it is override other method is over ridden
		
		
	}

}
