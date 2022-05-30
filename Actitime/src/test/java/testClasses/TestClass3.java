package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pack.Base;
import pomclasses.HomeHeaderPage;
import pomclasses.LoginPage;

public class TestClass3 {
	
	WebDriver driver;
	HomeHeaderPage homeHeaderPage;
	LoginPage loginpage;
	
	
	@Parameters ("browesrName")
	@BeforeTest
	public void Launchrowser(String Brower)
	{    
		if(Brower.equals("Chorme"))
		{
		  driver=Base.OpenChromeBrowser();
		}
		if(Brower.equals("Firefox"))
		{
		  driver=Base.OpenFireFoxBrowser();
		}
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
//	@BeforeClass
//	public void CreatePOMClassObject()
//	{
//		 homeHeaderPage=new HomeHeaderPage(driver);
//	     loginpage=new LoginPage(driver);
//		
//	}
//	
	@BeforeMethod
	public void LoginIntoPage()
	{
        driver.get("https://online.actitime.com/student23/login.do");
		
		
		loginpage.SendUsername();
		loginpage.SendPassword();
		loginpage.ClickLoginButton();
		
		
	}
	
	@Test
	public void VerifyTaskButton()
	{
		homeHeaderPage.ClickTask();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		if(url.equals("https://online.actitime.com/student23/tasks/tasklist.do"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@Test
	public void VerifyReportButton()
	{
		homeHeaderPage.ClickReport();
		 String url=driver.getCurrentUrl();
		System.out.println(url);
	   String  title=driver.getTitle();
		if(url.equals("https://online.actitime.com/student23/reports/dashboard.do"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void VerifyUserButton()
	{
		homeHeaderPage.ClickUser();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		if(url.equals("https://online.actitime.com/student23/administration/userlist.do"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@AfterMethod
	public void LogOutFromApplication()
	{ 
	
		homeHeaderPage.ClickOnLogout();
	}
	@AfterClass
	public void clearPOMObject()
	{
		loginpage=null;
		homeHeaderPage=null;
	}
	{
		
	}
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
		driver=null;
		System.gc();
	}


}
