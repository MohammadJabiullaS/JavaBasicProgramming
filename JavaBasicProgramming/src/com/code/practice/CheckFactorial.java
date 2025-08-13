package com.code.practice;

import java.util.Scanner;

public class CheckFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a valid number:");
		int num = scanner.nextInt();
		scanner.close();
		int fact = 1;
		for(int i =1; i < num+1; i++)
		{
			fact = fact*i;
		}
		System.out.println("The Factorial of the number "+num+ " is: "+fact);
			

	}

}
