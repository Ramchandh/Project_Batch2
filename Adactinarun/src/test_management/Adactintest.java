package test_management;

public class Adactintest {

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
