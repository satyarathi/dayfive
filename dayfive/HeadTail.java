package com.dayfive;
import java.util.Scanner;
import java.util.Random;

public class HeadTail {

	public static void main(String[] args) {
		
		int headcount = 0;
		int tailcount = 0;
		double head;
		double tail;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of coin flip");
		int toss = sc.nextInt();
		
		for (int i = 0;i < toss;i++) {
			double Random = Math.random();
			if (Random < 0.5)
				{
				tailcount++;
				}
			else {
				headcount++;
				}
		}
		head = headcount/(double)toss*100;
		System.out.println("Heads percentage :" +head);
		tail = tailcount/(double)toss*100;
		System.out.println("Tails percentage " +tail);
	}
}
