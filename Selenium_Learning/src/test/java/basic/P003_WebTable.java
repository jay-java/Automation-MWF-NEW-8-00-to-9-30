package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P003_WebTable {
	public static void main(String[] args) {
		String url ="https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.getConnection(url);
		WebElement name = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[2]/span"));
		System.out.println(name.getText());
	}
}
