package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//input[@id='username']
	//input[@name='pwd']
	//input[@id='keepLoggedInCheckBox']
	//a[@id='loginButton']
	
	@FindBy (xpath="//input[@id='username']")
	private WebElement userName;
	
	@FindBy (xpath="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement logiButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void SendUsername()
	{
		userName.sendKeys("vaibhavnirphal1@gmail.com");
	}
	public void SendPassword()
	{
		password.sendKeys("murud1111");
	}
	public void ClickLoginButton()
	{
		logiButton.click();
	}

}
