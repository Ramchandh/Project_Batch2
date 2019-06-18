package newtask_adactin;

public class adactin_1 {
	public static WebDriver driver;
	
	public static void company()
	{	
		driver.findElement(By.linkText("Company")).click();
	}
	
	public static void aboutCompany()
	{
		driver.findElement(By.linkText("About Adactin")).click();
		driver.findElement(By.xpath("//*[@id='post-16483']/div/div/div[2]//div/h2"));
	}
	

}
