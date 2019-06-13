package products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPage {
		public static String url="https://www.adactin.com/training/software-testing/";

		public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./src/browserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.linkText("Books and Publications")).click();

		String a= driver.findElement(By.xpath("//*[@id=\'sub-header\']/div/div/div/header/h1")).getText();
		System.out.println(a);

		}
}
