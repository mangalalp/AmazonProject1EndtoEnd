package assignments;

import mdule1.Variables_Package2;

public class Variables_Package1 extends Variables_Package2 {
//WAP on Access Specifier for variables outside the package by becoming the sub class
	public static void main(String[] args) {
		Variables_Package1 d1=new Variables_Package1();
		System.out.println(d1.a);
		System.out.println(d1.b);

	}

}
