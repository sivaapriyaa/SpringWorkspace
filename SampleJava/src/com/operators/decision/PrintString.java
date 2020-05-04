package com.operators.decision;

import java.util.Scanner;

public class PrintString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a="ConsultAdd ";
		String b="Java Training";
		System.out.println("Please enter a number: ");
		int num=s.nextInt();
		if((num%3==0) && (num%5==0)) {
			System.out.println(a+b);
		}
		else if(num%3 ==0) {
			System.out.println(a);
		}
		else if(num%5 ==0) {
			System.out.println(b);
		}
		else {
			System.out.println("Number not divisible by 3 or 5");
		}

	}

}
