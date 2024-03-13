package unit;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P05_AnnotationPractical {
	static WebDriver driver = null;
	@BeforeClass
	public static void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}
	@Test
	public void titleCheck() {
		String actual = driver.getTitle();
		String expected = "facebook";
		assertEquals(expected, actual);
	}
	
	@AfterClass
	public static void closeBrowser() {
		driver.close();
	}
}
