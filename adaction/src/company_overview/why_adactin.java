package company_overview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class why_adactin {

		public static WebDriver driver;
		
		public static void company()
		{

			driver.findElement(By.linkText("Company")).click();
		}
		
		public static void why()
		{
			driver .findElement(By.linkText("Why Adactin")).click();
		}
	}


