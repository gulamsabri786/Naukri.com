package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPhotoPage {
	@FindBy(xpath="//a[.='Upload Photo ']")
	private WebElement photolink;
	
	public UploadPhotoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
public void clickUploadPhoto()
{
	photolink.click();
}
}
