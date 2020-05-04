package com.operators.decision;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = 1;
		while (input > 0) {
			input = s.nextInt();
			if (input > 0) {
				System.out.println("Great Going");
				continue;
			}
			System.out.println("It's over");
			break;
		}
	}
}
