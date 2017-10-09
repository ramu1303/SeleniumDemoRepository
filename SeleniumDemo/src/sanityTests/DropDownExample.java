package sanityTests;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.linkText("create an account")).click();
		Select dropDown=new Select(driver.findElement(By.name("country")));
		//dropDown.selectByIndex(1);
		//dropDown.selectByVisibleText("India");
		List<WebElement> e=dropDown.getOptions();
		System.out.println(e.size());
		
		Iterator<WebElement> itr= e.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}
		
	}

}
