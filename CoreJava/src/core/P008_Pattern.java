package core;

import java.util.Scanner;

public class P008_Pattern {
	public static void main(String[] args) {
		for(int a = 1;a<=5;a++) {
			for(int b =1;b<=5;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int a = 1;a<=5;a++) {
			for(int b =1;b<=a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int a = 1;a<=5;a++) {
			for(int b =1;b<=a;b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		System.out.println();
		for(int a = 1;a<=5;a++) {
			for(int b =1;b<=a;b++) {
				System.out.print(a);
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println();
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number : ");
		int num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (i * num));
		}
		System.out.println("table using while loop");
		int j =1;
		while(j<=10) {
			System.out.println(num + " X " + j + " = " + (j * num));
			j++;
		}
		System.out.println("table using do while loop");
		int k =1;
		do {
			System.out.println(num + " X " + k + " = " + (k * num));
			k++;
		}
		while(k<=10);
	}
}
