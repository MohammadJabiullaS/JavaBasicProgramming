package com.code.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take user input as number to check the number is armstrong or not
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check armstrong:");
		int num = scanner.nextInt();
		scanner.close();
		System.out.println("You have entered the number:"+ num);
		String number = String.valueOf(num);
		List<Integer> digits = new ArrayList<Integer>();
		for(int i=0; i< number.length(); i++)
		{
			int j = Character.digit(number.charAt(i), 10);
			digits.add(j);
		}
		System.out.println("List of digits:"+digits);
		
		int arm = 0;
		Iterator<Integer> iterator = digits.iterator();
		while(iterator.hasNext())
		{
			int j = iterator.next();
			arm +=j*j*j;
		}
		System.out.println(arm);
		if (num == arm)
		{
			System.out.println("The "+num+ " is a armstrong");
		}
		else
		{
			System.out.println("The number is not armstrong");
		}
		

	}

}
