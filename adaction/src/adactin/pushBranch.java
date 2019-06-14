package adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pushBranch {
	
	public static WebDriver driver;
	public static void OurServices()
	{
	   driver.findElement(By.linkText("Our Services")).click();
	
	}
	public static void DevelopmentServices()
	{
      driver.findElement(By.linkText("Development Services")).click();
      driver.findElement(By.className("header-middle-content")).click();
      
     System.out.println("Bring your concepts – we turn them into REALITY"); 
      
	}
	}





