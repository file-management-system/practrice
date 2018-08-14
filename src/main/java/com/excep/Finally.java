package com.excep;

import java.util.Scanner;

//finally block
public class Finally {
	public static void main(String[] args) {

		int i = 8, j = 1, k;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter A Number:");
			j = Integer.parseInt(sc.nextLine());
			k = i / j;
			System.out.println("the value of k: " + k);

		} catch (ArithmeticException e) {
			System.out.println("cannot devide by Zero");
		} catch (Exception e) {
			System.out.println("unknown exception");
		}

		finally {
			sc.close();
			System.out.println(" FINALLY BYE");
		}

	}
}