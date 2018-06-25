package POM;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class ProjectPage extends BasePage {

	@FindBy(xpath="//span[.='ADD PROJECT ']")
	private WebElement add;
	
	@FindBy(xpath="//input[@id='projectTitle']")         
	private WebElement title;
	
	@FindBy(xpath="(//input[@class='srchTxt'])[1]")
	private WebElement text;
	
	@FindBy(xpath="(//a[@href='javascript:;'])[3]")
	private WebElement click;
	
	
	@FindBy(xpath="(//input[@class='sugInp'])")
	private WebElement clitext;
	

	@FindBy(xpath="(//span[@class='icon'])[3]")
private WebElement closebutton;
	
	public ProjectPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickaddproject(WebDriver driver) throws Exception
	{
		ElementIsPresent(driver,add);
		add.click();
	}
	public void clicktitle(WebDriver driver) throws Exception
	{
		ElementIsPresent(driver,title);
		title.sendKeys("Automation");
	}
	public void clicktext(WebDriver driver) throws Exception
	{
		ElementIsPresent(driver,text);
		text.click();
	}
	public void click(WebDriver driver) throws Exception
	{
		ElementIsPresent(driver,text);
		click.click();
	}
	public void clickcli(WebDriver driver) throws Exception
	{
		ElementIsPresent(driver,clitext);
		clitext.sendKeys("Qspiders Software Testing Training");
		clitext.sendKeys(Keys.ENTER);
		clitext.sendKeys(Keys.ESCAPE);

	}
	public void clicktyear(WebDriver driver,JavascriptExecutor j) throws Exception
	{
		Thread.sleep(5000);
		for(int i=1;i<=3;i++)
		{
		j.executeScript("window.scrollBy(0,80)");
		Thread.sleep(500);
		}
		
		
	}

	public void cl0se()
	{
	closebutton.click();	
	}
	

	
}
