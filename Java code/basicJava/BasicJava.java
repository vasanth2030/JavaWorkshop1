package basicJava;

import java.util.Scanner;

public class BasicJava {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name: ");			
		String name=sc.nextLine();
		int age=21;
		float height = (float) 178.5;  //178.5f
		System.out.println("Hello world");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Height: "+height+"cm");
	}
}
