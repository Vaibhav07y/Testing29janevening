package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeHeaderPage {
	//a[@class='content tasks']
	//a[@class='content reports']
	//a[@class='content users']
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement contentTask;
	
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement contentReport;
	
	@FindBy(xpath="//a[@class='content users']")
	private WebElement contentUser;
	
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logOut;
	//a[@id='logoutLink']
	
	public HomeHeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickTask()
	{
		contentTask.click();
	}
	public void ClickReport()
	{
		contentReport.click();
	}
	public void ClickUser()
	{
		contentUser.click();
	}
	public void ClickOnLogout()
	{
		logOut.click();
	}

}
