package com.dayfive;
import java.util.Scanner;
public class VowelCheck {
	public static void main(String[] args) {
		char operator; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		char x = ((sc.nextLine()).charAt(0));
		char y = Character.toUpperCase(x);
        switch (y) {
        
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            System.out.println(x+ " is a vowel");
            break;
            default: System.out.println(x+ " is not a vowel");
        }
        
    }
	}


