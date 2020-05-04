package com.operators.decision;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the number:");
		int num=s.nextInt();
		if((num%2)!=0)
			System.out.println("New");
		else if((num%2)==0) {
		if((num>=2)&&(num<=5)) {
			System.out.println("Old");
		}
		else if((num>=6)&&(num<=30)) {
				System.out.println("New1");
			}
		else if(num>30) {
			System.out.println("Old1");
		}}
		
		
	}

}
