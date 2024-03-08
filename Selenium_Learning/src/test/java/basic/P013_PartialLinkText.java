package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P013_PartialLinkText {
	public static void main(String[] args) {
		String url ="https://www.facebook.com/";
		WebDriver driver = DriverConnection.getConnection(url);
		
		List<WebElement> links = driver.findElements(By.partialLinkText("Create"));
		System.out.println(links.size());
		for(WebElement e: links) {
			String data = e.getText();
			System.out.println(data);
		}
		links.get(1).click();
		driver.navigate().back();
	}
}
