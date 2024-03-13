package unit;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import connection.DriverConnection;

@RunWith(Parameterized.class)
public class P07_FBParameter {
	String email,password;

	public P07_FBParameter(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	static WebDriver driver = null;
	@Before
	public void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}
	@Test
	public void loginTest() {
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.id("pass"));
		passEle.clear();
		passEle.sendKeys(password);
	}
	
	@Parameters
	public static List<Object[]> getData() {
		Object o[][] = new Object[4][2];
		o[0][0] = "incorrect@gamil.com";
		o[0][1] = "incorrect";
		
		o[1][0] = "incorrect@gmail.com";
		o[1][1] = "correct";
		
		o[2][0] = "correct@gmail.com";
		o[2][1] = "incrrect";
		
		o[3][0] = "correct@gmail.com";
		o[3][1] = "correct";
		
		return Arrays.asList(o);
	}
}
