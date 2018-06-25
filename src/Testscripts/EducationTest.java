package Testscripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.Edueditpage;
import POM.LogOutPage;
import POM.LoginPage;
import POM.UploadResumePage;
import generic.BaseTest;
import generic.Excel;

public class EducationTest extends BaseTest {
	@Test
	public void Education() throws Exception
	{
		LoginPage l=new LoginPage(driver);
		l.loginButton();
		
		String un=Excel.getdata(XL_PATH, "sheet1",0, 0);
		l.setUserName(un);
		
		String pw=Excel.getdata(XL_PATH, "sheet1", 0, 1);
		l.setPassword(pw);
		
		l.clicklogin();
		//***********
		
		UploadResumePage u=new UploadResumePage(driver);
		u.clickupdate(driver);
		
		Edueditpage e=new Edueditpage(driver);
		e.clickoneduedit(driver);
		//e.clickonedusave(driver);
		
		//******************logoutApplication********//
		LogOutPage l1=new LogOutPage(driver);
		Actions a=new Actions(driver);
		l1.logoutapp(a,driver);
	}

}
