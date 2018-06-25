package Testscripts;

import org.testng.annotations.Test;

import POM.DeletePhotoPage;
import POM.LoginPage;

import POM.UploadResumePage;
import generic.BaseTest;
import generic.Excel;

public class QDeletePhotoTest extends BaseTest
{
	@Test
	public void deletePhoto() throws Exception
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

	
	DeletePhotoPage d=new DeletePhotoPage(driver);
	d.click1();
	d.clickdeletelink();
	d.clickdeletebutton();
	
	
	
	
	
	}
}
