package com.syntax.class08;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		if (age>=18) {
			System.out.println("You are eligble to vote");
			}
		else {
			System.out.println("You are not eligble to vote");
		}
	}

}
