package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static WebDriver chromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sharekhan.com/");
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver firefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Velocity\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.sharekhan.com/");
		driver.manage().window().maximize();
		return driver;
	}

}
