package sanityTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.xpath("//div/a/span[text()='Shop by']"));
        
		Actions action=new Actions(driver);
        action.moveToElement(element).build().perform();
        driver.findElement(By.xpath("//div/span/span[text()='Amazon Prime Video']")).click();
        driver.findElement(By.xpath("//div/a/span[text()='All Videos']")).click();
        
       driver.findElement(By.xpath("//div/a[@class='nav-logo-tagline nav-sprite nav-prime-try']")).click();
       
	}

}
