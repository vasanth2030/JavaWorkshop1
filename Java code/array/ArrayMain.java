package array;

import java.util.Scanner;

public class ArrayMain {
	public static void main(String[] args) {
//		int arr[]= {10,20,30,40,50};
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the element: ");
			arr[i]=sc.nextInt();
		}
		printArray(arr);
		int sum=sumOfElementsInArray(arr);
		System.out.println("Sum of elements: "+sum);
		
	}
	
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();		
	}
	
	public static int sumOfElementsInArray(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];   //sum=sum+arr[i]
		}
		return sum;
	}

}
