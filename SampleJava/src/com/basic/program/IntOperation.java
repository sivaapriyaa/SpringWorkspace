package com.basic.program;

import java.util.Scanner;

public class IntOperation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers between 1 to 10: ");
		int a=s.nextInt();
		int b=s.nextInt();
		int z=a+b;
		int result=z+30;
		System.out.println("The result is "+result);
	}

}
