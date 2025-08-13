package com.code.practice;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not:");
		int prime = scanner.nextInt();
		if(prime == 0 || prime == 1)
		{
			System.out.println("The number is ");
		}
		if(prime == 2)
		{
			System.out.println("The number is prime");
		}
		if(isPrime(prime))
		{
			System.out.println("The number is prime");
		}
		else {
			System.out.println("The number is not prime");
		}

	}
	
	public static boolean isPrime(int num)
	{
		for(int i =2; i<=Math.sqrt(num); i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
