package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverConnection.DriverConnection;

public class P008_WindowHandle {
	public static void main(String[] args) {
		String url = "https://demo.guru99.com/popup.php";
		WebDriver driver = DriverConnection.getConnection(url);
		driver.findElement(By.linkText("Click Here")).click();
		String mainWin = driver.getWindowHandle();
		System.out.println("main win"+mainWin);
		Set<String> allWin = driver.getWindowHandles();
		for (String win : allWin) {
			System.out.println(win);
			if(!win.equals(mainWin)) {
				driver.switchTo().window(win);
				System.out.println("switched to new window");
				driver.findElement(By.name("emailid")).sendKeys("selenim@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
			}
		}
		driver.quit();
	}

}
