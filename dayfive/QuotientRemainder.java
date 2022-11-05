package com.dayfive;
import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {

		System.out.println("Enter Devisor :");
		Scanner divisor = new Scanner(System.in);
		int dr = divisor.nextInt();

		System.out.println("Enter Devidend :");
		Scanner devident = new Scanner(System.in);
		int dt = devident.nextInt();

		int quotient = dt / dr;
		System.out.println("Quotient :"+quotient);

		int remainder = dt % dr;
		System.out.println("Remainder :"+remainder);

	}
}