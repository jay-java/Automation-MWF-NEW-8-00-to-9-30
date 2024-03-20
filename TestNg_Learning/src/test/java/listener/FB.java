package listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import driverConnection.DriverConnection;

public class FB {
	@Test
	public void titleCheck(ITestContext i) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getConnection(url);
		String title = driver.getTitle();
		String expected = "FB";
		i.setAttribute("myDriver", driver);
		assertEquals(title, expected);
	}
}
