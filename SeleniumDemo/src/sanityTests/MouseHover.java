package sanityTests;

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
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[3]/a/span")).click();
        
		//Actions action=new Actions(driver);
        //action.moveToElement(element).build().perform();
       // element.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[3]/a/span")).click();
	}

}
