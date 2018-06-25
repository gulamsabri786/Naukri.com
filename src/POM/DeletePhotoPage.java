package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletePhotoPage {
	@FindBy(xpath="//button[.='DELETE PHOTO']")
	private WebElement deletelink;
	@FindBy(xpath="//button[.='DELETE']")
	private WebElement deleteButton;
	
	@FindBy(xpath="(//div[.='Approval Pending'])[1]")
	private WebElement click;
	
	public  DeletePhotoPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickdeletelink()
	{
		deletelink.click();
	}
	
	public void clickdeletebutton()
	{
		deleteButton.click();
	}
	public void click1()
	{
		click.click();
	}
	
	

}
