import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomclasses.HomeHeaderPage;
import pomclasses.LoginPage;

public class VerifyLoginAndHeader {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe\\")  ;
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/student23/login.do");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.SendUsername();
		loginpage.SendPassword();
		loginpage.ClickLoginButton();
		
		HomeHeaderPage homeHeaderPage=new HomeHeaderPage(driver);
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
		homeHeaderPage.ClickOnLogout();
		
    driver.get("https://online.actitime.com/student23/login.do");
		
	    loginpage=new LoginPage(driver);
		loginpage.SendUsername();
		loginpage.SendPassword();
		loginpage.ClickLoginButton();
		
		homeHeaderPage=new HomeHeaderPage(driver);
		homeHeaderPage.ClickReport();
		 url=driver.getCurrentUrl();
		System.out.println(url);
	    title=driver.getTitle();
		if(url.equals("https://online.actitime.com/student23/reports/dashboard.do"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		homeHeaderPage.ClickOnLogout();
		
		 driver.get("https://online.actitime.com/student23/login.do");
			
		    loginpage=new LoginPage(driver);
			loginpage.SendUsername();
			loginpage.SendPassword();
			loginpage.ClickLoginButton();
			

			homeHeaderPage=new HomeHeaderPage(driver);
			homeHeaderPage.ClickUser();
			 url=driver.getCurrentUrl();
			System.out.println(url);
		    title=driver.getTitle();
			if(url.equals("https://online.actitime.com/student23/administration/userlist.do"))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			homeHeaderPage.ClickOnLogout();
			driver.close();
			
		
		

	}

}
