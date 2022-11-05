package com.dayfive;
import java.util.Scanner;

public class PowerofTwo {

	public static void main(String[] args) {
		System.out.println("Enter any Number :");

		Scanner num = new Scanner(System.in);
		int power = num.nextInt();
		
		 int i = (int) (Math.pow(2,power));
		 System.out.println("Power of 2^"+power+" is :" +i);
		 
		
	}
}
