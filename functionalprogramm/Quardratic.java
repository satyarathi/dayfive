package com.functionalprogramm;
import java.util.Scanner;
public class Quardratic {
	 static void roots(int a, int b, int c) {

		int delta = (b * b) - (4 * a * c);
		double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
		double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
		System.out.println(x1);
		System.out.println(x2);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter value of a : ");
		int a = s.nextInt();
		System.out.println("enter value of b : ");
		int b = s.nextInt();
		System.out.println("enter value of c :");
		int c = s.nextInt();
		roots(a, b, c);

	}
}