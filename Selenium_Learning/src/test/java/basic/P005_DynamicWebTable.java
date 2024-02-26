package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P005_DynamicWebTable {
	public static void main(String[] args) {
		String url = "https://cosmocode.io/automation-practice-webtable/";
		WebDriver driver = DriverConnection.getConnection(url);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
		System.out.println(rows.size());
		List<WebElement> table_d = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td"));
		for (int i = 2; i <= table_d.size(); i++) {
			WebElement data = driver
					.findElement(By.xpath("//table[@id='countries']/tbody/tr[1]/td[" + i + "]/h3/strong"));
			System.out.print(data.getText() + "      ");
		}
		System.out.println();
		for (int i = 2; i <= rows.size(); i++) {
			List<WebElement> td = driver
					.findElements(By.xpath("//table[@id='countries']/tbody/tr[" + i + "]/td[2]/strong"));
			for (WebElement t : td) {
				System.out.print(t.getText() + "    ");
				List<WebElement> tdd = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[" + i + "]/td"));
				for (int j = 3; j <= tdd.size(); j++) {
					WebElement data = driver
							.findElement(By.xpath("//table[@id='countries']/tbody/tr[" + i + "]/td[" + j + "]"));
					System.out.print(data.getText() + "      ");
				}
			}

			System.out.println();
		}
	}
}
