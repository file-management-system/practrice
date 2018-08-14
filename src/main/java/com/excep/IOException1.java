package com.excep;

import java.util.Scanner;

public class IOException1 {
	public static void main(String[] args) {

		int i, j = 0, k = 0;
		Scanner sc = new Scanner(System.in);
		i = 8;
		System.out.println("Enter the value of j:");
		try {
			j = Integer.parseInt(sc.nextLine());

			k = i / j;

		} catch (ArithmeticException e) {
			System.out.println("cannot devide by zero");

		} catch (Exception e) {

		}

	}
}