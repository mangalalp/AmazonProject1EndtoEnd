package mdule1;

public class Global_Variable2 {

	public static void main(String[] args) {
		
		 System.out.println( Global_Variable1.a );
		 Global_Variable1 n1=new Global_Variable1();
		 System.out.println(n1.Salary);
		 
		 double area =Math.PI;// accessing global variable from other package
		 area= Math.PI*10*10;
		 System.out.println(area);
		

	}

}
