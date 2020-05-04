package com.operators.decision;

import java.util.Scanner;

public class CharacterInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
				char a=s.next().charAt(0);
				
				char result=Character.toLowerCase(a);
				String strrandom="random";
			String printString =(strrandom.indexOf(result)>=0)?"Found":"Not Found";
			System.out.println(printString);
	}

}
