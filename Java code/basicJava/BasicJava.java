package basicJava;

import java.util.Scanner;

public class BasicJava {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name: ");			
		String name=sc.nextLine();
		int age;
		float height;  //178.5f
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		System.out.println("Enter your height: ");
		height= sc.nextFloat();
		System.out.println("Hello world");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Height: "+height+"cm");
		sc.close();
	}
}
