package basicJava;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start of program");
		
		try {
			System.out.println("Enter two numbers: ");
			int a= sc.nextInt();
			int b= sc.nextInt();
			
			int div=div(a, b);
			
			System.out.println("Div: "+div);
//			throw new RuntimeException("Manually thrown exception");
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println("Please enter a non-zero divisor");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Exception caught");
		}
		finally {
			System.out.println("Inside finally block");
		}
		
		System.out.println("End of program");
	}
	
	public static int div(int num1, int num2) throws ArithmeticException
	{
		return num1/num2;
	}

}
