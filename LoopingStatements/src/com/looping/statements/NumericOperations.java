package com.looping.statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumericOperations {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int sum=0,avg=0;{
			for(int i=1;i<=10;i++) {
			System.out.println("Enter "+i+" of 10 numbers as input");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int a=Integer.parseInt(br.readLine());
			sum=sum+a;
			avg=sum/10;
			}
			System.out.println("The sum is: "+sum+" and average is: "+avg);
		
		}	

	}

}
