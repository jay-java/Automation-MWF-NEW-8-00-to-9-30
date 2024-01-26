package core;

import java.util.Scanner;

public class P006_ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a = ");
		int a = sc.nextInt();
		System.out.println("b = ");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}
		System.out.println("enter marks = ");
		int m = sc.nextInt();
		if (m < 35) {
			System.out.println("fail");
		} else if (m >= 35 && m <= 60) {
			System.out.println("C grade");
		} else if (m >= 61 && m <= 80) {
			System.out.println("B grade");
		} else if (m >= 81 && m <= 90) {
			System.out.println("A grade");
		} else if (m >= 91 && m <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("invalid input");
		}

		// nested if
		System.out.println("age = ");
		int age = sc.nextInt();
		if (age > 18) {
			if (age < 55) {
				System.out.println("eligible");
			} else {
				System.out.println("age is above 18 but not less than 55");
			}

		} else {
			System.out.println("age is below 18");
		}

		// switch case
		System.out.println("1.English\n2.Hindi\n3.Gujarati");
		System.out.print("enter your choice : ");
		int c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("You selected English");
			break;
		case 2:
			System.out.println("You selected Hindi");
			break;
		case 3:
			System.out.println("Gujarati");
			break;
		default:
			System.out.println("invalid input");
		}

	}
}