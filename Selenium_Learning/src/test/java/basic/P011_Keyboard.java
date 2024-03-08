package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driverConnection.DriverConnection;

public class P011_Keyboard {
	public static void main(String[] args) {
		String url ="https://www.google.com/";
		WebDriver driver = DriverConnection.getConnection(url);
		WebElement ele = driver.findElement(By.name("q"));
		
		Actions action = new Actions(driver);
		action.click(ele)
				.keyDown(Keys.SHIFT)
				.sendKeys("learn selenium")
				.keyUp(Keys.SHIFT)
				.pause(Duration.ofSeconds(3))
				.keyDown(Keys.ARROW_DOWN)
				.keyDown(Keys.ENTER)
				.build()
				.perform();
		
	}
}
