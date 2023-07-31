package com.training;



import java.util.Scanner;

public class Arithmatic {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter your first number");
		int firstNumber = obj.nextInt();
		System.out.println("Please enter your second number");
		int secondNumber = obj.nextInt();
		int result = firstNumber + secondNumber;
		System.out.println("The sum of two number is ");
		System.out.println(result);

	}
	

}
