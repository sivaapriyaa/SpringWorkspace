package com.basic.program;

public class Swap_numbers {
	
	//Using third variable
	/*public void swap(int a,int b)
	{
	int result;
	result=a;
	a=b;
	b=result;
	System.out.println("The value of a is:"+a);
	System.out.println("The value of b is:"+b);
	}*/
	
	//Without using third variable
	public void swap(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of A is: "+a+" and B is: "+b);
	}
	public static void main(String args[])
	{
		Swap_numbers swapnum=new Swap_numbers();
		swapnum.swap(10, 50);
	}

}
