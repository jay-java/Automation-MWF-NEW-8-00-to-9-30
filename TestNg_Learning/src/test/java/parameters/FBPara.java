package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import driverConnection.DriverConnection;

public class FBPara {
	static WebDriver driver = null;
	@BeforeMethod
	public static void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getConnection(url);
	}
	
	@Test(dataProvider = "dp")
	public void login(String email,String pass) {
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.id("pass"));
		passEle.clear();
		passEle.sendKeys(pass);
	}
	
	@DataProvider(name="dp")
	public static Object[][] getData(){
		Object o[][] = new Object[4][2];
		o[0][0] = "incorrect@gamil.com";
		o[0][1] = "incorrect";
		
		o[1][0] = "incorrect@gmail.com";
		o[1][1] = "correct";
		
		o[2][0] = "correct@gmail.com";
		o[2][1] = "incrrect";
		
		o[3][0] = "correct@gmail.com";
		o[3][1] = "correct";

		return o;
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
