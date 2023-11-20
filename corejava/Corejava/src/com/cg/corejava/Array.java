package com.cg.corejava;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,search,flag=0;
		System.out.println("Enter no of elements:");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element to be searched:");
		search=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==search)
			{
				System.out.println("Element "+search+" is found");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Element "+search+" not found");
		}

 
	}

}
