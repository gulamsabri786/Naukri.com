package Testscripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.Editpage;
import POM.LogOutPage;
import POM.LoginPage;
import POM.UploadResumePage;
import generic.BaseTest;
import generic.Excel;

public class KeySkillTest extends BaseTest {
	@Test
	public void keySkillTest() throws Exception
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
		Editpage e=new Editpage(driver);
		e.clickonedit(driver);  
		e.clickonsave(driver);
		
		//******************logoutApplication********//
		LogOutPage l1=new LogOutPage(driver);
		Actions a=new Actions(driver);
		l1.logoutapp(a,driver);
	}

}
