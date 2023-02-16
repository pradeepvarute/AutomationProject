package mahavitaranMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	
	private WebDriver driverG;
	private Actions act;
	private WebDriverWait wait;
	
	@FindBy (xpath="(//button[@aria-label='Close'])[2]")
    private WebElement CloseButton;
	
	@FindBy (xpath="(//a[@target='_blank'])[6]")
	private WebElement ConsumerPortal ;
	
	@FindBy (xpath="(//a[@target=' _blank'])[1]")
	private WebElement AplyForNewConection;
	
	@FindBy (xpath="(//span[@class='icon-hover'])[2]")
	private WebElement RenewablePortal;
	
	@FindBy (xpath="(//span[@class='icon-hover'])[4]")
	private WebElement RegisterYourComplaint;
	
	@FindBy (xpath="(//span[@class='icon-hover'])[6]")
	private WebElement HtConsumerPort;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driverG=driver;
		act=new Actions(driver);
		wait=new WebDriverWait(driver,10);
	}
	
	public void clikOnCloseButton()
	{
		CloseButton.click();
	}
	
	public void clikOnConsumerPortal()
	{
		ConsumerPortal.click();
	}
	
	public void clikOnAplyForNewConection()
	{
		AplyForNewConection.click();
	}
	
	public void MoveToElementRenewablePortal()
	{
		 act.moveToElement(RenewablePortal).click().perform();
	}
	
	public void clikOnRegisterYourComplaint()
	{
		RegisterYourComplaint.click();
	}
	
	public void clikOnHtConsumerPort()
	{
		HtConsumerPort.click();
	}

	
}
