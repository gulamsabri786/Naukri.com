package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class UploadResumePage extends BasePage {
	
	@FindBy(xpath="//a[.='UPDATE PROFILE']")
	private WebElement update;
	
	@FindBy(xpath="//input[@id='attachCV']")
	private WebElement upload;
	
	public UploadResumePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickupdate(WebDriver driver) throws Exception
	{
		ElementIsPresent(driver, update);
		update.click();
	}
	public void clickudResume(JavascriptExecutor j) throws InterruptedException
	{
		Thread.sleep(5000);
		for(int i=1;i<=16;i++)
		{
		j.executeScript("window.scrollBy(0,200)");
		Thread.sleep(500);
		}
		
	}
	public void update() throws InterruptedException
	{
		Thread.sleep(500);
		upload.sendKeys("d:\\Resume.pub");
	}
}
