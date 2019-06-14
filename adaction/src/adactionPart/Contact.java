package adactionPart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contact {
	 public static WebDriver driver;

	public static void method1()
	{
		driver.findElement(By.linkText("Contact Us")).click();
	}
	public static void method2()
	{
		driver.findElement(By.name("your-name")).sendKeys("sara");
	}
}