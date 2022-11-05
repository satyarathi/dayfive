package com.dayfive;
import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		System.out.println("Enter any Number :");

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		double sum = 0.0;

		for(int i = num;i >0;i--) {
			sum = sum + (double)1/i;
			System.out.println(sum+"," );
		}
	}
}
