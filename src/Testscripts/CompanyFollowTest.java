package Testscripts;


import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.CompanyFollowPage;
import POM.LogOutPage;
import POM.LoginPage;

import generic.BaseTest;
import generic.Excel;

public class CompanyFollowTest extends BaseTest {
@Test
public void followingCompanyProfile() throws Exception
{
	LoginPage l=new LoginPage(driver);
	l.loginButton();
	
	String un=Excel.getdata(XL_PATH, "sheet1",0, 0);
	l.setUserName(un);
	
	String pw=Excel.getdata(XL_PATH, "sheet1", 0, 1);
	l.setPassword(pw);
	
	l.clicklogin();
	//**************************//
	CompanyFollowPage p=new CompanyFollowPage(driver);
	p.clickprofile();
	//p.clickfollow(driver);
	
	//************************//
	Actions a=new Actions(driver);
	Thread.sleep(5000);

	//******************logoutApplication********//
	LogOutPage l1=new LogOutPage(driver);
	l1.logoutapp(a,driver);
	
//BasePage.VerifypageisDisplay(driver,"Profile Action | Mynaukri");
}
}
