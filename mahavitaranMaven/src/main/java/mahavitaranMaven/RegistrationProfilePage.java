package mahavitaranMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationProfilePage {
	
	private WebDriver driverG;
	private Actions act;
	private WebDriverWait wait;
	
	@FindBy (xpath="//span[text()='New User Registration']")
	private WebElement registration;
	
	@FindBy (xpath="//input[@id='consumerNumber']")
	private WebElement ConsumerName;
	
	@FindBy (xpath="//input[@id='mobileNumber']")
	private WebElement MobileNumber;
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement Email;
	
	@FindBy (xpath="//input[@id='txtEmailOTP']")
	private WebElement EmailOTP;
	
	@FindBy (xpath="//input[@id='loginName']")
	private WebElement LogInName;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement Password;
	
	@FindBy (xpath="//input[@id='confirmPassword']")
	private WebElement ConfirmPassword;
	
	@FindBy (xpath="//span[@id='lblSubmit']")
	private WebElement SubmitButton;
	
	@FindBy (xpath="//label[text()='Registration']")
	private WebElement RegistrationText;
	
	
	public RegistrationProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driverG=driver;
		act=new Actions(driver);
		wait=new WebDriverWait(driver,10);
		
	}
	
	public void clikOnregistration()
	{
		registration.click();
	}
	
	public void sendKeysConsumerName()
	{
		ConsumerName.sendKeys("12345");
	}
	
	public void sendKeysMobileNumber()
	{
		MobileNumber.sendKeys("7769028845");
	}
	
	public void sendKeysEmail()
	{
		Email.sendKeys("pradeep@gmail.com");
	}
	
	public void sendKeysLogInName()
	{
		LogInName.sendKeys("pradeep");
	}
	
	public void sendKeysPassword()
	{
		Password.sendKeys("pass@123");
	}
	
	public void sendKeysConfirmPassword()
	{
		ConfirmPassword.sendKeys("pass@123");
	}
	
	public void clikOnSubmitButton()
	{
		//driverG.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		SubmitButton.click();
	}
	
	public void scrolldown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driverG;
		js.executeScript("window.scrollby(0,50)");
	}
	
	public String RegistrationText()
	{
		String text=RegistrationText.getText();
		System.out.println(text);
		return text;
		
	}
	
	

}
