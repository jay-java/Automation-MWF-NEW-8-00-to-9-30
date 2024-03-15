package eshop;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class user {
	@Test
	public void createAcconnt() {
		System.out.println("create account");
	}
	@Test(groups = "purchase")
	public void login() {
		System.out.println("login : ");
	}
	@Test(groups = "smoke")
	public void profile() {
		System.out.println("profile");
	}
	@Test
	public void changePassword() {
		System.out.println("change password");
	}
	@Test
	public void logout() {
		System.out.println("logout");
	}
}
