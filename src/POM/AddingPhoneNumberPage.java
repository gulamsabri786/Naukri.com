package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class AddingPhoneNumberPage extends BasePage {
	
	@FindBy(xpath="//a[.='VIEW ALL']")
	private WebElement verifyall;

	@FindBy(xpath="//span[.='Edit']")
	private WebElement edit;
	
	@FindBy(xpath="//input[@id='mob_number']")
	private WebElement mobnumber;
	
	@FindBy(xpath="//button[.='SAVE']")
	private WebElement save;
	
	public AddingPhoneNumberPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verify()
	{
		verifyall.click();
	}
	public void edit(WebDriver driver) throws Exception
	{
		ElementIsPresent(driver,edit);
		edit.click();
	}
	public void mobnumber(WebDriver driver) throws Exception
	{
		ElementIsPresent(driver,mobnumber);
		mobnumber.clear();
		mobnumber.sendKeys("7899476967");
	}
	public void save()
	{
		save.click();
	}
	
	
}
