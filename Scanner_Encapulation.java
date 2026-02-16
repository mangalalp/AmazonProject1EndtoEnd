package mdule1;

import java.util.Scanner;

public class Scanner_Encapulation {

	
	private int age=60;
	
	public int getAge()
	{
		return age;
		
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public static void main(String[] args) {
		Scanner_Encapulation v1= new Scanner_Encapulation();
		Scanner sc=new Scanner(System.in);
		v1.setAge(60);
		System.out.println("enter the age:"+v1.getAge());
	int age=	sc.nextInt();
		
	}

}
