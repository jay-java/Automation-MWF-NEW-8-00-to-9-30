package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P004_TableData {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.getConnection(url);
		List<WebElement> head = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		System.out.println(head.size());
		for (int i = 1; i <= head.size(); i++) {
			WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th[" + i + "]/span"));
			System.out.print(data.getText() + "    ");
		}
		System.out.println();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		for (int i = 2; i <= rows.size(); i++) {
			List<WebElement> td = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td"));

			for (int j = 1; j <= td.size(); j++) {
				WebElement data = driver
						.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]/span"));
				System.out.print(data.getText() + "    ");
			}
			System.out.println();
		}

	}
}
