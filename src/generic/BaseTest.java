  package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConst {
	
	
	public WebDriver driver;
	@BeforeMethod
	public void openAppication()
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
	}
	
	@AfterMethod
	public  void closeApplication(ITestResult r)
	{
		int status=r.getStatus();
		String testname=r.getName();
	    if(status==2)
	    {
	    	GetPhoto.getScreenShot(driver, PHOTO_PATH, testname);
	    }
	   driver.quit();
	    
	}
	

}
