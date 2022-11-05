package com.functionalprogramm;
import java.util.Scanner;
public class Distance {
	static void calculate(int x, int y) {
		double result = Math.pow((x * x + y * y), 0.5);
		System.out.println("distance is " + result);
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter value for x");
		int x = s.nextInt();
		System.out.println("enter value for y ");
		int y = s.nextInt();
		calculate(x, y);
	}
}


