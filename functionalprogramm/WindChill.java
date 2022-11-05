package com.functionalprogramm;
import java.util.Scanner;
public class WindChill {

	static void eTemperature(double t, double v) {

		double w = 35.74 + 0.62158 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println(w);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("enter temperature in fahrenheit");
		double t = s.nextDouble();
		System.out.println("enter wind speed in miles per hour");
		double v = s.nextDouble();
		if (Math.abs(t) > 50 || v > 120 || v < 3) {
			System.out.println("enter correct input");
		} else {
			eTemperature(t, v);
		}

	}
}
