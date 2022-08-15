package basicJava;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start of program");
		System.out.println("Enter your age: ");
		int age= sc.nextInt();
		if(age>=18)
		{
			System.out.println("You are an adult");
		}
		System.out.println("End of program");
		
	}

}
