package dependency;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class User {
	@Test
	public void createAcconnt() {
		System.out.println("create account");
	}
	@Test(dependsOnMethods = "createAcconnt")
	public void login() {
		assertFalse(true);
		System.out.println("login : ");
	}
	@Test
	public void profile() {
		System.out.println("profile");
	}
	@Test
	public void changePassword() {
		System.out.println("change password");
	}
	@Test(dependsOnMethods = "login")
	public void logout() {
		System.out.println("logout");
	}
}
