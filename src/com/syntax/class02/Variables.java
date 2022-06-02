package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		String firstname="Josh";
		String lastname="Plantin";
		Byte age=28;
		Long phone=5072081827L;
		String city="Chicago";
		String state="Illinois";
				
		System.out.println("My name is "+firstname+" and my last name is "+lastname);
		char grade='A';
		System.out.println("I am a "+grade+" student");
		System.out.println("I live in "+city+" "+state);
		System.out.println("And my phone number is "+phone);
		
		firstname="Jack";
		lastname="Plantin";
		age=27;
		phone=5075134617L;
		city="Rochester";
		state="Minnesota";
		
		System.out.println("My name is "+firstname+" "+lastname+" and I moved to the new city of "+city+", "+state+"."+" My new phone number is "+phone);
		
		

	}

}
