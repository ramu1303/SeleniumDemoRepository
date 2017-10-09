package sanityTests;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");	
		String parentWindow=driver.getWindowHandle();
		Set<String> childWindows=driver.getWindowHandles();
		
		for(String s:childWindows)
		{
			if(!parentWindow.equalsIgnoreCase(s))
			{
				driver.switchTo().window(s);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		/*ArrayList<String> al=new ArrayList<String>(childWindows);
		driver.switchTo().window(al.get(3));
		driver.close();
		driver.switchTo().window(al.get(2));
		driver.close();
		driver.switchTo().window(al.get(1));
		driver.close();
		driver.switchTo().window(al.get(0));
		driver.close();*/
	}

}
