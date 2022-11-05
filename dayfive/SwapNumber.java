package com.dayfive;

public class SwapNumber {

	public static void main(String[] args) {
		int firstnum = 5;
		int secondnum = 9;

		System.out.println("Before swap");
		System.out.println("First number : " + firstnum);
		System.out.println("Second number : " + secondnum);

		int n = firstnum;
		firstnum = secondnum;
		secondnum = n;

		System.out.println("After swap");
		System.out.println("First number : " + firstnum);
		System.out.println("Second number : " + secondnum);
	}

}

