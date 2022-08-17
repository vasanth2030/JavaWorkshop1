package basicJava;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
//		int i=1;
//		int sum=0;
//		while(i<=n)
//		{
//			if(i%2!=0)
//			{
//				sum+=i;    // sum= sum+i
//			}
//			i++;
//		}
//		System.out.println(sum);
		
//		do {
//			System.out.println("Hello world "+i);
//			i++;
//		}while(i<=n);
		
		for(int i=1;i<=n;i++)
		{
			if(i==5)
				continue;
			System.out.println("Hello world "+i);
		}
	}

}
