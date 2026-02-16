package mdule1;

public class Reuturn_Keyword {
	
	static int add(int a, int b, int c)
	{
		int sum=a+b+c;
		return sum;
	}
	static double multiply(int a,double b)
	{
		double mul=a*b;
		return mul;
	}

	public static void main(String[] args) {
		System.out.println(add(1,2,3));//directly print without storing
		 // Call the methods and store the returned values
        int sumResult = add(10, 20, 30);
        double mulResult = multiply(5, 6.5);

        System.out.println("Sum: " + sumResult);
        System.out.println("Multiply: " + mulResult);

	}

}
