package products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	 public static WebDriver driver;
	public static void method1()
	{
		driver.findElement(By.xpath("//*[@id=\"mega-menu-item-17906\"]/a")).click();
	}
	public static void method2()
	{
		driver.findElement(By.linkText("Product Partners")).click();
		boolean a=driver.findElement(By.xpath("//div[1]/div/div/div/div/div/div/div[1]/div/div/div/div/div/img")).isDisplayed();
		System.out.println(a);
	}


}
