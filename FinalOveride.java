package mdule1;
 final class MethodParent{
	
        void login()
       {
               System.out.println("Login using email id");
       }
}

public class FinalOveride extends MethodParent {
	
        void login_mobileno()
        {
                System.out.println("Login using mobile no");

        }
       
	public static void main(String[] args) {
		
		FinalOveride  t1=new FinalOveride ();	}

}
