package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public abstract class BaseScript {
	
	static WebDriver driver;

	public static void newAddingCalendar() {
		Assert.assertEquals(false, false);
		driver = new ChromeDriver();
		driver.findElement(By.xpath("div/img"));
	}
}
