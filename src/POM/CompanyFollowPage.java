package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.BasePage;

public class CompanyFollowPage extends BasePage{
	@FindBy(xpath="//span[.='PROFILE VIEWS']")
	private WebElement clickprofile;
	
	@FindBy(xpath="(//a[.='FOLLOW'])[1]")
	private WebElement clicfollow;
	
	public CompanyFollowPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickprofile()
	{
		clickprofile.click();
	}
	
	public void clickfollow(WebDriver driver) throws Exception
	{
		ElementIsPresent(driver,clicfollow);
		clicfollow.click();
		Reporter.log("follwing company page",true);
		String expected = driver.getTitle();
		System.out.println(expected);
		Thread.sleep(3000);
		//VerifypageisDisplay(driver, "Profile Action | Mynaukri");
	}
	
	
}
