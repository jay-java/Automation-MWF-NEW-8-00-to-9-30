package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P001_OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
		//1.Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jay-pc\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://www.facebook.com/";
		driver.manage().window().maximize();
		driver.get(url);
		WebElement createaccount =  driver.findElement(By.linkText("Create new account"));
		createaccount.click();
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("java");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("selenium");
		
		
		
		
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("selenium@gmail.com");
//		WebElement pass = driver.findElement(By.id("pass"));
//		pass.sendKeys("selenium@123");
		Thread.sleep(3000);
		driver.close();
//		//*[@id="email"]
//		#email
//		html//*[@id="content"]/div/div/div/div[1]/div[1]/img
//		#content > div > div > div > div._4bl9._ihf > div._8ice > img
		//2.firefox
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jay-pc\\Downloads\\geckodriver-v0.33.0-win64 (1)\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		String url ="https://www.facebook.com/";
//		driver.manage().window().maximize();
//		driver.get(url);
//		Thread.sleep(3000);
//		driver.close();
		
		
		//3.Edge
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\jay-pc\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		String url ="https://www.facebook.com/";
//		driver.manage().window().maximize();
//		driver.get(url);
//		Thread.sleep(3000);
//		driver.close();
	}
}
