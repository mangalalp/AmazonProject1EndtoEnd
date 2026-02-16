package mdule1;

public class Global_Varible {
	
	
	
	
		int noOfDays=365;  //global varibale-Instance Variable
		static int noOfHours=24; //global varibale
		static boolean  answer;
		  String name="jaya";

		public static void main(String[] args) 
		{
			answer=true;
			noOfHours=36;
		int	noOfDays=36;
            
			System.out.println(answer);//24
			System.out.println(noOfHours);//24
			Global_Varible n1=new Global_Varible();
			System.out.println(n1.name);
			
			Global_Varible t1=new Global_Varible();
					System.out.println(t1.noOfDays);

		
		}
}
		
	




	
