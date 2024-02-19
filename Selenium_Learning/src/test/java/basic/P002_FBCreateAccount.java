package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverConnection.DriverConnection;

public class P002_FBCreateAccount {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getConnection(url);
//		driver.findElement(By.id("email")).sendKeys("selenium@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("selenium@123");
//		driver.findElement(By.xpath("//form[@class='_9vtf']/div[1]/div[1]/input")).sendKeys("xyz");	
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz");
//		driver.findElement(By.id("day")).sendKeys("56");

		// 15th march 2020
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByIndex(14);

		WebElement month = driver.findElement(By.id("month"));
		Select monhts = new Select(month);
		monhts.selectByValue("3");

		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByVisibleText("2020");

		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(1).click();
//		for (WebElement e : gender) {
//			System.out.println(e);
//		}
	}
}
