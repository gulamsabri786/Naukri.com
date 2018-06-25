package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class LoginPage extends BasePage {
	
	@FindBy(xpath="(//div[.='Login'])[1]")
	private WebElement login;
	
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement unTB;
	
	
	@FindBy(xpath="//input[@name='PASSWORD']")
	private WebElement pwTB;
	
	@FindBy(xpath="//button[.='Login']")
	private WebElement clickbutton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginButton() throws InterruptedException
	{
		
		login.click();
	}
	
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clicklogin()
	{
		clickbutton.click();
	}
	

}
