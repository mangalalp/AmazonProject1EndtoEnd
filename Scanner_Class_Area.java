package mdule1;
import java.util.Scanner;
public class Scanner_Class_Area {

	public static void main(String[] args) {
		
			
			//area of square
				Scanner s1=new Scanner(System.in);
				System.out.println(" Please enter the value of a:");
				double a=s1.nextDouble();
				
				double area=a*a;
				System.out.println(area);
				
				//area of circle
				System.out.println(" Please enter the value of r:");
				double r=s1.nextDouble();
				
				double area2=Math.PI*r*r;
				System.out.println(area2);
				
				//Area of Triangle
				System.out.println(" Please enter the value of b:");
				int b=s1.nextInt();
				
				System.out.println(" Please enter the value of h:");
				int h=s1.nextInt();
				
				double area1=0.5*b*h;
				System.out.println(area1);
				
				//Area of Rectangle
				System.out.println(" Please enter the value of l:");
				int l=s1.nextInt();
				
				System.out.println(" Please enter the value of b1:");
				int b1=s1.nextInt();
				
				int area3=l*b1;
				System.out.println(area3);

				
				s1.close();
			}
			}
		

	


