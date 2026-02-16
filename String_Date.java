package mdule1;

import java.util.Date;

public class String_Date {
	
	public static void main(String[] args) {
		Date d1=new Date(); //constructor
		
		long d2=d1.getTime();
		System.out.println(d2);
		
		Date d3=new Date(d1.getTime()+1000*60*60*24*30l);//parameterized constructor
	System.out.println(d3);//+for future time and -for past time
		
	String dateformat=	d3.toString();
	String month=dateformat.substring(4, 7);
	System.out.println(month);
	String date=dateformat.substring(8, 10);
	
	System.out.println(date);
	String Year=dateformat.substring(dateformat.length()-4);
	System.out.println(Year);
	
	String dateformat2=date.concat(" ").concat(month).concat(" ").concat(Year);
	System.out.println( dateformat2);
	//WAP to find out the hour,min and sec 
	String Hourminsec=dateformat.substring(11, 19);
	System.out.println(Hourminsec);
	
	
	}
	

}
