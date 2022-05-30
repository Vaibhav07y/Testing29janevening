package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {

	public static WebDriver OpenChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe\\")  ;
		 WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
		
	}
	
	public static WebDriver OpenFireFoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe")  ;
		 WebDriver driver=new FirefoxDriver();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
		
	}
	
	/*public static WebDriver OpenOperaBrowser()
	{
		System.setProperty("webdriver.opera.driver","C:\\Users\\Admin\\Desktop\\selenium\\operadriver_win64\\operadriver_win64\\operadriver.exe")  ;
		 WebDriver driver=new OperaDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
		
	}*/

}
