package com.program.array;

import java.util.Arrays;

public class SecondLargestNo {

	public static void main(String[] args) {
		int[] my_array = {
	            106,99,46,190,550,1320,456};
	System.out.println("Original numeric array : "+Arrays.toString(my_array));            
	Arrays.sort(my_array);
	int index = my_array.length-1;
	while(my_array[index]==my_array[my_array.length-1]){
	index--;
	}
	System.out.println("Second largest value: " + my_array[index]);
	}

	}

