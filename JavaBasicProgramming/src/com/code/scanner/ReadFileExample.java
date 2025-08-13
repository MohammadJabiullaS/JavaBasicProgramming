package com.code.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			File fileObj = new File("C:\\Users\\Jabiulla\\Downloads\\Resume.txt");
			System.out.println(fileObj);
			Scanner fileReader = new Scanner(fileObj);
			while(fileReader.hasNextLine())
			{
				String fileData = fileReader.nextLine();
				System.out.println(fileData);
			}
			
			String email = fileReader.findInLine("[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]{2,}");
			if(email !=null ) { System.out.println("Email found in the doc:"+email);}
			else { System.out.println("No email found");}
			
			fileReader.close();
		} catch(FileNotFoundException ex) {
			System.out.println("Problem in reading the file");
			ex.printStackTrace();
			
		}

	}

}
