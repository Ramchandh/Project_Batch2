package firstProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Adactin1 {

	public static String url="https://www.adactin.com/blog/";
	
	public static void main(String[] args)
			throws InterruptedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./src/browserDrivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
driver.get(url);

driver.findElement(By.linkText("Java API: Backward Compatibility")).click();
driver.findElement(By.linkText("Three National Awards: What’s the Secret Sauce?")).click();
driver.findElement(By.linkText("Page Object Model using Selenium WebDriver")).click();
driver.findElement(By.linkText("Behavior Driven Development")).click();

		
		
	}

}
