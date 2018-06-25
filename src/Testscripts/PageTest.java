package Testscripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.AddingPhoneNumberPage;
import POM.LogOutPage;
import POM.LoginPage;
import POM.ProjectPage;
import POM.UploadResumePage;
import generic.BaseTest;
import generic.Excel;

public class PageTest extends BaseTest {
	@Test
	public void testproject() throws Exception
	{
	LoginPage l=new LoginPage(driver);
	l.loginButton();
	
	String un=Excel.getdata(XL_PATH, "sheet1",0, 0);
	l.setUserName(un);
	
	String pw=Excel.getdata(XL_PATH, "sheet1", 0, 1);
	l.setPassword(pw);
	
	l.clicklogin();
	UploadResumePage u=new UploadResumePage(driver);
	u.clickupdate(driver);
	//*************************//
	
	AddingPhoneNumberPage d=new AddingPhoneNumberPage(driver);
	d.verify();
	
	//*********************
	
	ProjectPage p=new ProjectPage(driver);
	p.clickaddproject(driver);
	p.clicktitle(driver);
	p.clicktext(driver);
	p.click(driver);
	p.clickcli(driver);
	//***************************
	
	Actions a=new Actions(driver);
	Thread.sleep(5000);
	
	//******************logoutApplication********//
	LogOutPage l1=new LogOutPage(driver);
	
	l1.logoutapp(a,driver);


}}
