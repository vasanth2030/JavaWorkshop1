package basicJava;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start of program");
//		System.out.println("Enter your age: ");
//		int age= sc.nextInt();
//		if(age>=18)
//		{
//			System.out.println("You are an adult");
//		}
//		else {
//			System.out.println("You are a child");
//		}
		
		
//		System.out.println("Enter 3 numbers: ");
//		int num1=sc.nextInt();
//		int num2=sc.nextInt();
//		int num3=sc.nextInt();
//		
//		if(num1>num2 && num1>num3)
//		{
//			System.out.println(num1+" is the largest number");
//		}
//		else if(num2>num1 && num2>num3)
//		{
//			System.out.println(num2+" is the largest number");
//		}
//		else {
//			System.out.println(num3+" is the largest number");
//		}
		
		
//		if(num<0)
//		{
//			System.out.println("Enter a non negative number");
//		}
//		else if(num==0)
//		{
//			System.out.println("Number is zero");
//		}
//		else if(num%2==0)
//		{
//			System.out.println("Even number");
//		}
//		else {
//			System.out.println("Odd number");
//		}
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		String result= (age<0)?"Invalid age":(age>18)?"Adult":"Child";
		
		System.out.println(result);
		
		
		
//		switch(n)
//		{
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//		default:
//			System.out.println("Enter a valid input");
//		}
		
		
		
		System.out.println("End of program");
		
	}

}
