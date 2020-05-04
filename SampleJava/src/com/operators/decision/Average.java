package com.operators.decision;

public class Average {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		avgmethod(10, 8,2);

	}
	
	private static void avgmethod(int a , int b, int c) {
		
		int avg = (a+b+c)/3;
		System.out.println("avg =" + avg);
		if((avg>a)&&(avg>b)&&(avg>c)) 
			System.out.println("avg is higher than a,b,c");
		else if((avg>a)&&(avg>b))
			System.out.println("avg is higher than a,b");
		else if((avg>a)&&(avg>c))
			System.out.println("avg is higher than a,c");
		else if((avg>c)&&(avg>b))
			System.out.println("avg is higher than b,c");
		else if((avg>a))
			System.out.println("avg is higher than a");
		else if((avg>b))
			System.out.println("avg is higher than b");
		else 
			System.out.println("avg is higher than c");
		
	}

}
