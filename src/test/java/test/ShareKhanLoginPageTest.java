package test;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ShareKhanLoginPage;
import utility.Excel;


public class ShareKhanLoginPageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser()
	{
		driver=Browser.chromeBrowser();
		//driver=Browser.firefoxBrowser();
	}
	
	@Test
	public void loginTest() throws InterruptedException, EncryptedDocumentException, IOException
	{
		ShareKhanLoginPage shareKhanLoginPage=new ShareKhanLoginPage(driver);
		Thread.sleep(2000);
		shareKhanLoginPage.clickOnLogin();
		Thread.sleep(5000);
		ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		Excel.getData("credential", 1, 0);
		Thread.sleep(2000);
		shareKhanLoginPage.clickOnNext();
		
	}
	

}
