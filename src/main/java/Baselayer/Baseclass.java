package Baselayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	private static ThreadLocal<WebDriver> threaddriver = new ThreadLocal<WebDriver>();
	
	public WebDriver getDriver()
	{
		return threaddriver.get();
	}
		public static void initialization(String browsername)
		{
			WebDriver driver = null;
			
			if (browsername.equalsIgnoreCase("chrome"))
				
			{
				driver=new ChromeDriver();
			}
			
			if (browsername.equalsIgnoreCase("Edge"))
				
			{
				driver=new EdgeDriver();
			}
			if (browsername.equalsIgnoreCase("firefox"))
				
			{
				driver=new FirefoxDriver();
			}
			
			threaddriver.set(driver);
		
			driver.get("https://www.saucedemo.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().deleteAllCookies();
			
			
			
		}

		


}
