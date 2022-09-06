package array;

import java.util.Scanner;

public class SearchingAlgorithms {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to search: ");
		int num=sc.nextInt();
		
		linearSearch(arr, num);
		binarySearch(arr, num);
	}
	
	public static void linearSearch(int arr[], int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				System.out.println("Linear Search: Number found at index "+i);
				return;
			}
		}
		System.out.println("Linear Search: Number does not exist in the array");
	}
	
	public static void binarySearch(int arr[],int x)
	{
		int l=0;
		int r=arr.length-1;
		
		while(l<=r)
		{
			int mid= (l+r)/2;
			
			if(arr[mid]==x)
			{
				System.out.println("Binary Search: Number found at index "+mid);
				return;
			}
			else if(arr[mid]<x)
			{
				l=mid+1;
			}
			else
			{
				r=mid-1;
			}
		}
		
		System.out.println("Binary Search: Number does not exist in the array");
	}
}
