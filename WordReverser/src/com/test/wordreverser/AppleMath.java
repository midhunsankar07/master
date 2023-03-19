package com.test.wordreverser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AppleMath {
	
//	public static void main(String[] args) {
//		int input1 = 3;
//		int[] input2 = {80, 48, 82}; //{8, 20, 28}
//		//output 48 48 48 = 144
//		//20 20 = 40
//		//minSum();
//	}
	public static void main(String[] args) {		
		Integer[] input1 = {2, 5, 15, 20, 8};
		List<Integer> outArr =  new ArrayList<>();
		for(int i = 0; i < input1.length-1 ;i++) {
		  Integer[] newInput = Arrays.copyOfRange(input1, i, input1.length);
		  System.out.println("newInput val..."+Arrays.toString(newInput));
		  int output = minSum(newInput);	
		  System.out.println(output); 		 
		  outArr.add(output);
		}
		
		int max = Collections.max(outArr);
		System.out.println(max); 		 
	}
	
	static int minSum(Integer[] input1) {
		List<Integer> intArr = Arrays.asList(input1);
		int min = Collections.min(intArr);
		int index = intArr.indexOf(min);
	
		//System.out.println(min)	;
		return min*input1.length;
	}
}
