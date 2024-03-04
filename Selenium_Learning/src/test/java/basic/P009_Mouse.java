package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driverConnection.DriverConnection;

public class P009_Mouse {
	public static void main(String[] args) {
		String url = "https://www.amazon.in/";
		WebDriver driver = DriverConnection.getConnection(url);
		
		WebElement fresh =  driver.findElement(By.linkText("Fresh"));
		WebElement mini =  driver.findElement(By.linkText("Amazon miniTV"));
		WebElement sell =  driver.findElement(By.linkText("Sell"));
		WebElement bs =  driver.findElement(By.linkText("Best Sellers"));
		
		Actions action = new Actions(driver);
		action.moveToElement(fresh).build().perform();
		action.moveToElement(mini).build().perform();
		action.moveToElement(sell).build().perform();
		action.moveToElement(bs).build().perform();
		bs.click();
	}
}
