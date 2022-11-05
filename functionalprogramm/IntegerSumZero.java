package com.functionalprogramm;
import java.util.Scanner;

public class IntegerSumZero {
	static Scanner s = new Scanner(System.in);

	static void sumcountzero(int n) {
		int[] arr = new int[n];
		int count = 0;
		System.out.println("enter values");
		
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						count++;
						System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "=" + "0");
					}
				}
			}
		}
		System.out.println("total number of pairs  :" + count);

	}
	public static void main(String[] args) {

		System.out.println("enter no of inputs :");
		int n = s.nextInt();
		sumcountzero(n);
	}
}

	