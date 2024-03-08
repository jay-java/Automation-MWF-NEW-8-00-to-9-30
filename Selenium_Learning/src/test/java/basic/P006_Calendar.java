package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P006_Calendar {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker";
		WebDriver driver = DriverConnection.getConnection(url);
		WebElement iFrame = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(iFrame);
		System.out.println("switched into iFrame");
		Thread.sleep(3000);
		driver.findElement(By.id("datepicker")).click();

		String myDate = "15";
		String myMonth = "May";
		String myYear = "2005";

		WebElement currentYear = driver.findElement(By.className("ui-datepicker-year"));
		String cyear = currentYear.getText();
		System.out.println(cyear);
		int my = Integer.parseInt(myYear);
		System.out.println(my);
		int cy = Integer.parseInt(cyear);
		System.out.println(cy);
//		WebElement prev = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[1]/span"));
		while (!myYear.equals(driver.findElement(By.className("ui-datepicker-year")).getText())) {
			if (my > cy) {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span")).click();
			} else {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[1]/span")).click();
			}
		}
		while (!myMonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText())) {
			if (my > cy) {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span")).click();
			} else {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[1]/span")).click();
			}
		}
		List<WebElement> dates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement d : dates) {
			if(myDate.equals(d.getText())) {
				d.click();
			}
		}
	}
}
