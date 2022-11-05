package com.dayfive;
import java.util.Scanner;

public class Factor {
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void primeFactors(int n) {
		for (int i = 2; i <= n; i++) {
			int t = n % i;
			if (t == 0) {
				if (isPrime(i))
					System.out.println(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no to find prime factors");
		int n = s.nextInt();
		System.out.println("Prime factors are ");
		primeFactors(n);
	}
}
