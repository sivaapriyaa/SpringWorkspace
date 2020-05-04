package com.looping.statements;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number for generating multiplication table:");
		int a=s.nextInt();
		for(int i=1;i<=10;i++) {
			int n=i*a;
			System.out.println(a+"X"+i+"="+n);
			
		}
		

	}

}
