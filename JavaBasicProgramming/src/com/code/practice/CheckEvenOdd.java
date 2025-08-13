package com.code.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check Even or Odd:");
		int num = scanner.nextInt();
		if(num % 2 == 0)
		{
			System.out.println("The number "+num+" is Even");
		}
		else
		{
			System.out.println("The number "+num+" is Odd");
		}
		
		List<Integer> digits = new ArrayList<Integer>();
		digits.add(2);
		digits.add(3);
		digits.add(5);
		digits.add(6);
		digits.add(8);
		digits.add(9);
		
		Iterator<Integer> iterator = digits.iterator();
		while(iterator.hasNext())
		{
			int digit = iterator.next();
			if(digit % 2 ==0)
			{
				System.out.println("The number "+digit+ " is a Even number");
			}
			else {
				System.out.println("The number "+digit+ " is a odd number");
			}
		}
		
		
		

	}

}
