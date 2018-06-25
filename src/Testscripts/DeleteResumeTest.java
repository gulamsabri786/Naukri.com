package Testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.DeletePage;
import POM.LogOutPage;
import POM.LoginPage;
import POM.UploadResumePage;
import generic.BaseTest;
import generic.Excel;

public class DeleteResumeTest extends BaseTest {
	
	@Test
	public void resumeDeletion() throws Exception
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
		//************** 
		
		DeletePage d=new DeletePage(driver);
		d.clickdeletelink();
		d.clickdelete();
		//******************logoutApplication********//
		Actions a=new Actions(driver);
		Thread.sleep(5000);
		LogOutPage l1=new LogOutPage(driver);
		
		l1.logoutapp(a,driver);
	
}
}
