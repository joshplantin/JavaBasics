package com.syntax.class05;

public class Donor {

	public static void main(String[] args) {
    
		int age=17;
		int weight=120;
		if (age>=18) {
			if (weight >= 110) {
				System.out.println("You are" + age + " years old, and your weight is over 110 lbs");
				System.out.println("You are eligble to be a donor");
			} else {
				System.out.println("You are " + age + "years old,");
			}
		}
	}

}
