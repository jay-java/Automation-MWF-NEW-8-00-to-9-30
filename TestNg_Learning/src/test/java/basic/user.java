package basic;

import org.testng.annotations.Test;

public class user {
	@Test(priority = 1)
	public void createAcconnt() {
		System.out.println("create account");
	}
	@Test(priority = 2,expectedExceptions = ArithmeticException.class)
	public void login() {
		int i = 10/0;
		System.out.println("login : "+i);
	}
	@Test(priority = 3)
	public void profile() {
		System.out.println("profile");
	}
	@Test(priority = 4)
	public void changePassword() {
		System.out.println("change password");
	}
	@Test(priority = 5)
	public void logout() {
		System.out.println("logout");
	}
}
