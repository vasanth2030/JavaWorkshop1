package basicJava;

import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a= sc.nextInt();
		int b=sc.nextInt();
		int sum=sum(a, b);
		System.out.println("Sum: "+sum);
		printHelloWorld();
	}
	
	public static int sum(int num1, int num2)
	{
		int sum=num1+num2;
		return sum;
	}

	public static void printHelloWorld()
	{
		for(int i=0;i<10;i++)
		{
			if(i==5)
				return;
			System.out.println("Hello world");
		}
	}
}
