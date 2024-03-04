package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverConnection.DriverConnection;

public class P007_Alert {
	public static void main(String[] args) throws InterruptedException {
		String url ="https://demoqa.com/alerts";
		WebDriver driver = DriverConnection.getConnection(url);
		
		//1.alert
//		driver.findElement(By.id("alertButton")).click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();
		
		//2.Alert
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
//		driver.findElement(By.id("timerAlertButton")).click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		//3.alert
//		driver.findElement(By.id("confirmButton")).click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.dismiss();
		
		//4.alert
		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys("hello selenium");
		alert.accept();
	}
}
