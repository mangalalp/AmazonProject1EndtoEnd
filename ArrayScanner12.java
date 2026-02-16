package mdule1;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayScanner12 {
    	

    	

    	    public static void main(String[] args) {
    	        Scanner s1 = new Scanner(System.in);

    	        // Prompt user for array size
    	        System.out.print("Please enter the size of the array: ");
    	        int[] rollno = new int[s1.nextInt()];

    	        // Input elements into the array
    	        for (int i = 0; i < rollno.length; i++) {
    	            System.out.print("Please enter the value at index position " + i + ": ");
    	            rollno[i] = s1.nextInt();
    	            System.out.println( Arrays.toString(rollno));
    	        }
    	       
    	        // Close scanner
    	        s1.close();
    	    
    	}
}

     
    
    	    

