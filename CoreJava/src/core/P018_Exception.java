package core;

import java.util.InputMismatchException;
import java.util.Scanner;

class Divide{//harsh
	public void division() throws ArithmeticException,InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a = ");
		int a = sc.nextInt();
		System.out.print("enter b = ");
		int b = sc.nextInt();
		if(b>0) {
			int c = a / b;
			System.out.println(c);
		}
		else {
			throw new ArithmeticException("cannot divide by zero");
		}
		
		
	}
}
public class P018_Exception {//dipesh
	public static void main(String[] args) {
		try {
			Divide d = new Divide();
			d.division();
		} catch (ArithmeticException e) {
			
		}
		
		
		
		
		
		
		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("enter a = ");
//			int a = sc.nextInt();
//			System.out.print("enter b = ");
//			int b = sc.nextInt();
//			int c = a / b;
//			System.out.println(c);
//		} catch (ArithmeticException e) {
//			System.out.println("cannot divide by zero");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("denominator should be numeric and >0");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("this wil execute everytime");
//		}
	}
}
