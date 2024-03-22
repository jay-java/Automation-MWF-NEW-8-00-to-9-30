package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driverConnection.DriverConnection;

public class CrossBrowserTest {
	@Parameters({"browser"})
	@Test
	public void browserTest(String browser) {
		String url = "https://www.facebook.com/";
		WebDriver driver = null;
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
//			driver.get(url);
		}
		if(browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "D:\\webdriver\\geckodriver-v0.34.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
//			driver.get(url);
		}
		if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
//			driver.get(url);
		}
		driver.get(url);
	}
}
