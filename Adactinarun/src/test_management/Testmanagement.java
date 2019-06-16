package test_management;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testmanagement {
public static void main(String []args) throws InterruptedException {
		
	

		
		System.setProperty("webdriver.gecko.driver", "./src/browserDrivers/geckodriver.exe");
		WebDriver arun= new FirefoxDriver();
	    arun.manage().window().maximize();
		arun.get("https://www.adactin.com/");
		arun.findElement(By.partialLinkText("Training")).click();
		Thread.sleep(2000);
		arun.findElement(By.partialLinkText("Test Management")).click();
		
	}
}

