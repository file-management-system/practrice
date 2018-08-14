package com.excep;

//try with multiple catch//ArrayIndexOutOfBound Exception
public class DemoException {

	public static void main(String[] args) {
		int i, j, k = 0;
		i = 8;
		j = 2;
		int a[] = new int[4];
		try {
			k = i / j;
			for (int c = 0; c <= 4; c++) {
				a[c] = c + 1;

			}
			for (int value : a) {
				System.out.println("value");
			}
		} catch (ArithmeticException e) {// it will handle arithmatic exception
			System.out.println("cannot devided by 0");
		} catch (Exception e) {// It will handle all exceptions
			System.out.println("maximum number is 4");
		}

	}
}
