package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletePage {
	@FindBy(xpath="//a[.='DELETE RESUME']")
	private WebElement deletelink;
	@FindBy(xpath="(//button[.='DELETE'])[2]")
	private WebElement deleteButton;
	
	public DeletePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickdeletelink()
	{
		deletelink.click();
	}
	public void clickdelete()
	{
		deleteButton.click();
	}
	

}
