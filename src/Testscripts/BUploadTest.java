package Testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.LogOutPage;
import POM.LoginPage;
import POM.UploadResumePage;
import generic.AutoConst;
import generic.BaseTest;
import generic.Excel;

public class BUploadTest extends BaseTest implements AutoConst{
	@Test
	public void uploadingCV() throws Exception
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
		JavascriptExecutor j=(JavascriptExecutor) driver;
		u.clickudResume(j);
		u.update();
		
		//******************logoutApplication********//
		LogOutPage l1=new LogOutPage(driver);
		Actions a=new Actions(driver);
		l1.logoutapp(a,driver);
		
		
	}

}
