package mdule1;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		int []  rollno=new int[4];
		rollno[0]=20;
		rollno[1]=25;
		rollno[2]=26;
		rollno[3]=23;
		
	/*	System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
		System.out.println(rollno[3]);
		for(int i=0; i<=rollno.length-1; i++)
			for(int i=0; i<rollno.length; i++)
	*/System.out.println(Arrays.toString(rollno));	
		
String[] name=new String[4];
    name[0]="Mangala";
    name[1]="Arjun";
    name[2]="Aryan";
    name[3]="Lingaraj";
    
    for (int i=0; i<name.length; i++)
   {
 //   	System.out.println(name[i]);
   }
	{
		System.out.println(Arrays.toString(name));
	}

	}
}
