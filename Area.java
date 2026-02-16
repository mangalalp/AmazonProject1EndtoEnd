package mdule1;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		int a=s1.nextInt();
				int area=a*a;
				
				System.out.println(area);
				double l=s1.nextDouble();
				double h=s1.nextDouble();
				
			double area1=0.5*l*h;
			System.out.println(area1);

	}

}
