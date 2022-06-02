package com.syntax.reviewclass2;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter your age");
		int age=scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Please Enter your name");
		String name=scanner.nextLine();
		System.out.println(name+age);
		
		
		
		
	}

}
