package com.code.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CheckFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a valid number to process:");
		int num = scanner.nextInt();
		scanner.close();
		List<Integer> digits = new ArrayList<Integer>();
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		digits.add(n1);
		digits.add(n2);
		for(int j =2; j<num; j++)
		{
			n3 = n1+n2;
			n1 = n2;
			n2= n3;
			digits.add(n2);
		}
		Iterator<Integer> iterator = digits.iterator();
		while(iterator.hasNext())
		{
			System.out.println("The Fibonacci of the number "+num+ " is:" +iterator.next());
		}
		

	}

}
