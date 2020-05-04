package com.operators.decision;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first,second,result=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter a number from 1-5:");
		int input=s.nextInt();
		if(input > 5) {
			System.out.println("Invalid Input");
		}
		else {
		System.out.println("Please enter 2 numbers:");
		first=s.nextInt();
		second=s.nextInt();
		switch(input){
			case 1:
				result=first+second;
				break;
			case 2:
				result=first-second;
				break;
			case 3:
				result=first/second;
				break;
			case 4:
				result=first*second;
				break;
			case 5:
				System.out.println("Please enter 2 more numbers:");
				int first1=s.nextInt();
				int second1=s.nextInt();
				result=(first+second+first1+second1)/4;
				break;
		}
		if(result<0) {
			System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number"); 
		}else
				System.out.println("The result is "+result);
		}	
	}

	}
