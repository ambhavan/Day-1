package com.cg.corejava;
import java.util.Scanner;
public class SimpleCompoundIntrest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				double p,t,r,si,ci;
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter the value of p=");
				p=scanner.nextDouble();
				System.out.println("Enter the value of t=");
				t=scanner.nextDouble();
				System.out.println("Enter the value of r=");
				r=scanner.nextDouble();
				si=(p*t*r)/100;
				ci=p*Math.pow(1+r/100,t)-p;
				System.out.println("Simple Interest:"+si);
				System.out.println("Compound Interest:"+ci);

			}
 

}
