package sanityTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowserTest
{ 
	static int browser;
	static int browserCount=3;
	static String browserName;
	public static void main(String[] args) 
	{
		for(browser=1;browser<=browserCount;browser++)
		{
			if(browser==1)
			{
				browserName="chrome Browser";
				System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com");
				String s1=driver.getTitle();
				if(s1.equals("Google"))
				System.out.println(browserName + "  " + "execution passed" );
			}
			
			if(browser==2)
			{
				browserName="mozilla Browser";
				System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.18.0-win64\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.google.com");
				String s1=driver.getTitle();
				if(s1.equals("Google"))
				System.out.println(browserName + "  " + "execution passed" );
			}
			
			if(browser==3)
			{
				browserName="IE Browser";
				System.setProperty("webdriver.ie.driver", "F:\\IEDriverServer_x64_3.5.1\\IEDriverServer.exe");
				WebDriver driver=new InternetExplorerDriver();
				driver.get("https://www.google.com");
				String s1=driver.getTitle();
				if(s1.equals("Google"))
				System.out.println(browserName + "  " + "execution passed" );
			}
		}

	}

}
