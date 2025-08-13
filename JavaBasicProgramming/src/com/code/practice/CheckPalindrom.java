package com.code.practice;

import java.util.Scanner;

public class CheckPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter a valid number or String to check the palimdrom:");
		String checkString = scanner.nextLine();
		scanner.close();
		String lowerCaseString = checkString.toLowerCase();
		String reverseString = "";
		for(int i=lowerCaseString.length()-1; i>=0; i--)
		{
			reverseString += lowerCaseString.charAt(i);
			
		}
		if(lowerCaseString.equals(reverseString))
		{
			System.out.println("Is Palimdrome");
		}
		else
		{
			System.out.println("Is not Palimdrome");
		}
	}

}
