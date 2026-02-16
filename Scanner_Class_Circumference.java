package mdule1;
import java.util.Scanner;
public class Scanner_Class_Circumference {

	public static void main(String[] args) {

		Scanner s1=new Scanner(System.in);
		
	//circumference of circle
		System.out.println(" Please enter the value of r:");
		double r=s1.nextDouble();
		
		double circumference=2*Math.PI*r;
		System.out.println(circumference);
		
		
		//circumference of square
		System.out.println(" Please enter the value of r:");
		int a=s1.nextInt();
		int circumference1=4*a;
		System.out.println(circumference1);
		
		
		//circumference of triangle
		System.out.println(" Please enter the value of a1:");
		int a1=s1.nextInt();
		
		System.out.println(" Please enter the value of b:");
		int b=s1.nextInt();
		
		System.out.println(" Please enter the value of c:");
		int c=s1.nextInt();
		
		int circumference2=a1+b+c;
		System.out.println(circumference2);

		//circumference of rectangle
		System.out.println(" Please enter the value of l:");
		double l=s1.nextInt();
		
		System.out.println(" Please enter the value of w:");
		int w=s1.nextInt();
		
		double circumference3=2*(l+w);
		System.out.println(circumference3);
		
		s1.close();

	}

}
