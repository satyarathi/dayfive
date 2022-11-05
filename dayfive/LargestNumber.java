package com.dayfive;

public class LargestNumber {

	public static void main(String[] args) {
		int [] arr = new int [] {5, 80, 80, 17, 23, 9};  
		int large = arr[0];

		for (int i = 0; i < arr.length; i++) {  
			if(arr[i] > large)  
				large = arr[i];  
		}  
		System.out.println("Largest element in array is " + large);  
	}
}
