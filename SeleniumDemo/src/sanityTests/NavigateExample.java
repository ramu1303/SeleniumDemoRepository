package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExample 
{
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.amazon.com/");
		
		driver.navigate().to("https://www.google.com/");
		/*driver.findElement(By.linkText("Advertise")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();*/
		
	}

}
