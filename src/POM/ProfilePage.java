package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class ProfilePage extends BasePage {
	@FindBy(xpath="//img[@class='user-img']")
	private WebElement camerabutton;
	@FindBy(xpath="//input[@id='fileUpload']")
	private WebElement uploadbutton;
	
	@FindBy(xpath="//button[.='SAVE PHOTO']")
	private WebElement savebutton;
	
	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickcamera(WebDriver driver) throws Exception
	{
		ElementIsPresent(driver,camerabutton);
		camerabutton.click();
	}
	
	public void clickuploadButton(WebDriver driver)throws Exception
	{
		Thread.sleep(5000);
		uploadbutton.sendKeys("D:\\cope.jpg");;
	}
	
	public void clicksavePhoto(WebDriver driver)throws Exception
	{
		ElementIsPresent(driver,savebutton);
		savebutton.click();
	}

}
