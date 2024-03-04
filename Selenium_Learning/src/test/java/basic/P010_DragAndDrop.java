package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driverConnection.DriverConnection;

public class P010_DragAndDrop {
	public static void main(String[] args) {
		String url = "https://www.globalsqa.com/demo-site/draganddrop/";
		WebDriver driver = DriverConnection.getConnection(url);
		
		WebElement iframe = driver.findElement(By.xpath("//div[@rel-title='Photo Manager']/p/iframe"));
		driver.switchTo().frame(iframe);
	
		WebElement img1= driver.findElement(By.xpath("//ul[@id='gallery']/li[1]/img"));
		WebElement trash = driver.findElement(By.id("trash"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(img1)
			.moveToElement(trash)
			.release()
			.build()
			.perform();
	}
}
