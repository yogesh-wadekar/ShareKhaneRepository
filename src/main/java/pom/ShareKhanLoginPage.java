package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShareKhanLoginPage {
	@FindBy (xpath= "//a[text()=\"Login/Trade\"]") private WebElement login;
	@FindBy (xpath= "//input[@name='emailLoginId']") private WebElement id;
	@FindBy (xpath= "//button[@type='submit']") private WebElement next;
		
	
	public ShareKhanLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogin()
	{
		login.click();
	}
	
	public void enterEmailId(String id)
	{
		this.id.sendKeys(id);
	}
	
	public void clickOnNext()
	{
		next.click();
	}

}
