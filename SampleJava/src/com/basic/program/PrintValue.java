package com.basic.program;

import java.util.Scanner;

public class PrintValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your age:");
		int a=s.nextInt();
		s.nextLine();
		System.out.println("Please enter your name:");
		String name=s.nextLine();
		System.out.println("Your name is "+name+" and your age is "+a);
			
		

	}

}
