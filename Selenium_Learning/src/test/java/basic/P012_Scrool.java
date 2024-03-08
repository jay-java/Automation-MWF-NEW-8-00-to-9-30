package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P012_Scrool {
	public static void main(String[] args) {
		String url = "https://demoqa.com/automation-practice-form";
		WebDriver driver = DriverConnection.getConnection(url);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 1.by pixels
//		js.executeScript("window.scrollBy(0,150)", "");
		// 2.by ele
		WebElement btn = driver.findElement(By.id("uploadPicture"));
		js.executeScript("arguments[0].scrollIntoView();", btn);
		// 3.height
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
