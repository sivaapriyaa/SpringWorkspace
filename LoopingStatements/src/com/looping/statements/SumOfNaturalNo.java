package com.looping.statements;

import java.util.Scanner;

public class SumOfNaturalNo {

	public static void main(String[] args) {
		int count = 1, total = 0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input: ");
		int num=s.nextInt();
		
	       while(count <= num)
	       {
	           total = total + count;
	           count++;
	       }

	       System.out.println("Sum of natural numbers is: "+total);
	    }


}
