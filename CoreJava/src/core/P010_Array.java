package core;

import java.util.Scanner;

public class P010_Array {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		int i[]= {1,2,3,4,5,6,7,8,9,10};
		for(int index =0;index<i.length;index++) {
			System.out.println("i ="+i[index]);
		}
		int sum=0;
		for(int index=0;index<i.length;index++) {
			sum = sum+i[index];
//			System.out.println("sum : "+sum);
		}
		System.out.println("sum : "+sum);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int index=0;index<arr.length;index++) {
			System.out.print("enter element at arr["+index+"] : ");
			arr[index] = sc.nextInt();
		}
		System.out.println("enter number to search in array : ");
		int num = sc.nextInt();
		int counter = 0;
		for(int index=0;index<arr.length;index++) {
			if(num == arr[index]) {
				counter++;
			}
		}
		if(counter>0) {
			System.out.println("yes "+num+" is exist "+counter+" times");
		}
		else {
			System.out.println("no");
		}
	}
}
