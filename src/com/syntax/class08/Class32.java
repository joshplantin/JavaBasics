package com.syntax.class08;
import java.util.Scanner;
public class Class32 {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char gender;
    int age;
    
    System.out.println("Please enter your age: M or F");
    gender=scan.next().charAt(0);
    System.out.println("Please enter your age");
    age=scan.nextInt();
    
    if (age>25) {
    if(gender == 'F') {
    System.out.println("Woman");}
    else {
    System.out.println("Man");}
    }
	else {
    if (gender == 'F') {
    	System.out.println("Girl");}
    	else {
    	System.out.println("Boy");}
   
    	}
    
    }
    
	}


