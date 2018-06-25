package Testscripts;



import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.AddingPhoneNumberPage;
import POM.LogOutPage;
import POM.LoginPage;
import POM.UploadResumePage;
import generic.BaseTest;
import generic.Excel;

public class AddingNumberTest extends BaseTest{
	@Test
	public void numberadding() throws Exception
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
	d.edit(driver);
	d.mobnumber(driver);
	d.save();
	
	/**************logout******************/
	
	Actions a=new Actions(driver);
	Thread.sleep(5000);
	LogOutPage m=new LogOutPage(driver);
	m.logoutapp(a,driver);


	
}
}