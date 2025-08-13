package com.code.collections;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare int and string based array
		
		int[] numbers= {1,2,3,4,5};
		String[] carBrands = new String[5]; //Size of the Array that mean we can insert only 5 elements to it
		carBrands[0] = "Audi";
		carBrands[1] = "BMW";
		carBrands[2] = "Mercedes Benz";
		carBrands[3] = "Dodge";
		carBrands[4] = "Ferrori";
		
		//Uncomment the below line - Let see what will happen if we insert the 6th element to the carBrands array
		//carBrands[5] = "Honda";
		//you will get an expection - ArrayIndexOutOfBoundException 
		System.out.println(numbers[1]);
		System.out.println(carBrands.length);
		
		//loop
		for(int i=0; i<carBrands.length; i++)
		{
			System.out.println(carBrands[i]);
		}
		
		//sort
		int[] digits = {2,1,4,3,6,5};
		//java.util.Arrays.sort(digits);
		Arrays.sort(digits);
		System.out.println(java.util.Arrays.toString(digits));
		
		//binarySearch
		//int index = java.util.Arrays.binarySearch(digits, 3);
		int index = Arrays.binarySearch(digits, 3);
		System.out.println("Index of the number is:"+ index);
		
		//copyOf()
		//int[] copiedDigits = java.util.Arrays.copyOf(digits, 2);
		int[] copiedDigits = Arrays.copyOf(digits, 2);
		System.out.println(Arrays.toString(copiedDigits));
		
		//copyOfRange()
		int[] copiedDigits2 = java.util.Arrays.copyOfRange(digits, 2, 4);
		System.out.println(Arrays.toString(copiedDigits2));
		
		//Array compare
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		
		boolean areEqual = Arrays.equals(arr1, arr2);
		System.out.println("Arrays are equals is: "+areEqual);
		
		//fill() array with same number (size)
		int[] emptyArray = new int[5];
		Arrays.fill(emptyArray, 7);
		System.out.println(Arrays.toString(emptyArray));
		

	}

}
