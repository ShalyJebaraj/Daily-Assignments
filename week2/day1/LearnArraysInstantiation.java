package week2.day1;

import java.util.Arrays;

public class LearnArraysInstantiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Syntax --> dataType variable[] = new dataType[size];
		
		int numbers[] = new int[7];
		
		numbers[0] = 100;
		numbers[1] = 99;
		numbers[2] = 98;
		numbers[3] = 97;
		numbers[4] = 96;
		numbers[5] = 95;
		
		
//		System.out.println(numbers);
		System.out.println(numbers[3]);
	//	System.out.println(numbers[6]);
	//	System.out.println(numbers[2]);
	//	System.out.println(numbers[2] = 16);
		
		
		Arrays.sort(numbers);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			
		}
		
		System.out.println("number 5 --> " +numbers[5]);
	}

}
