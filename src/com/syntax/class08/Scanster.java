package com.syntax.class08;

import java.util.Scanner;

public class Scanster {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter your age");
System.out.println("Enter your mobile number");
System.out.println("Enter your age");

String name = scan.nextLine();
String number = scan.nextLine();
int age = scan.nextInt();

System.out.println("Your name is "+name+" your age is "+age+" and your mobile number is "+number);


	
	
	}
}
