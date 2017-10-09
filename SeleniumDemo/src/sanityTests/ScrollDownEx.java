package sanityTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownEx 
{
	static JavascriptExecutor jse;
	static WebDriver driver;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		jse=(JavascriptExecutor)driver;
		jse.executeScript("scroll(0,1000)");
		//driver.close();
	}

}
