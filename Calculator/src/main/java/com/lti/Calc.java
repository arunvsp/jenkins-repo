package com.lti;

public class Calc {
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	public static int diff(int num1, int num2) {
		return num1 - num2;
	}
	public static int prod(int num1, int num2) {
		return num1 * num2;
	}
	public static int div(int num1, int num2) {
		return num1 / num2;
	}
	public static void main(String args[]) {
		System.out.println("add="+add(10, 20));
		System.out.println("difference="+diff(100, 20));
		System.out.println("product="+prod(100, 20));
		System.out.println("product="+div(100, 20));

	}
}
