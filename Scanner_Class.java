package mdule1;

import java.util.Scanner;
public class Scanner_Class {

	public static void main(String[] args) {
		
		
		
		
		{
			
			{
			Scanner s1 =new Scanner(System.in);	
			//addition
			int value1=	s1.nextInt();
			int value2=	s1.nextInt();
			int sum=value1+value2;	
				System.out.println(sum);
				
				
				//substraction
				int salary1=s1.nextInt();
				int vp=s1.nextInt();
				int sub=salary1-vp;
				System.out.println(sub);
				
				//multiplication
				double area1=s1.nextDouble();
				double area2=s1.nextDouble();
				double area=area1*area2;
				System.out.println(area);
				
				//division
				int d1=s1.nextShort();
				int d2=s1.nextShort();
				int d3=d1/d2;
				System.out.println(d3);
				
				//mod
				
				int m1=s1.nextInt();
				int m2=s1.nextInt();
				int m3=m1%m2;
				System.out.println(m3);
				
				s1.close();
			}
		}
		
		}
		
		
	}


