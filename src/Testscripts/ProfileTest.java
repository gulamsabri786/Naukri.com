package Testscripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.LogOutPage;
import POM.LoginPage;
import POM.ProfilePage;

import POM.UploadResumePage;
import generic.BaseTest;
import generic.Excel;

public class ProfileTest extends BaseTest  {
	@Test
	public void profile() throws Exception
	{
		{
			//*************login************//
			LoginPage l=new LoginPage(driver);
			l.loginButton();
			
			String un=Excel.getdata(XL_PATH, "sheet1",0, 0);
			l.setUserName(un);
			
			String pw=Excel.getdata(XL_PATH, "sheet1", 0, 1);
			l.setPassword(pw);
			
			l.clicklogin();
			//**********uploading***********//
			UploadResumePage u=new UploadResumePage(driver);
			u.clickupdate(driver);
			//UploadPhotoPage u1=new UploadPhotoPage(driver);
			ProfilePage p=new ProfilePage(driver);
			p.clickcamera(driver); 
			p.clickuploadButton(driver);
			p.clicksavePhoto(driver);
			// u1.clickUploadPhoto();
			//******************logoutApplication********//
			LogOutPage l1=new LogOutPage(driver);
			Actions a=new Actions(driver);
			l1.logoutapp(a,driver);
			
	}

}
}