package mahavitaranMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnergyBillCalculator {
	
	private WebDriver driverG;
	private Actions act;
	private WebDriverWait wait;
	
	
	@FindBy (xpath="//span[text()='Energy Bill Calculator']")
	private WebElement EnergyBillCalculator;
	
	@FindBy (xpath="//select[@id='supplyType']")
	private WebElement SupplyTypDropdown;
	
	@FindBy (xpath="//select[@id='tariff']")
	private WebElement tariffDropdown;
	
	@FindBy (xpath="///select[@id='HT_S_Voltage_Level']")
	private WebElement VoltgeDropdown;
	
	@FindBy (xpath="//input[@id='contractDemand']")
	private WebElement ContactDemond;
	
	@FindBy (xpath="//input[@id='kwhSlot1']")
	private WebElement Slot1TimeKVAh;
	
	@FindBy (xpath="//input[@id='kvaSlot1']")
	private WebElement Slot1TimeKVA;
	
	@FindBy (xpath="//input[@id='kwhSlot2']")
    private WebElement Slot2TimeKVAh;
	
	@FindBy (xpath="//input[@id='kvaSlot2']")
	private WebElement Slot2TimeKVA;
	
	@FindBy (xpath="//input[@id='kwhSlot3']")
	private WebElement Slot3TimeKVAh;
	
	@FindBy (xpath="//input[@id='kvaSlot3']")
	private WebElement Slot3TimeKVA;
	
	@FindBy (xpath="//input[@id='kwhSlot4']")
	private WebElement Slot4TimeKVAh;
	
	@FindBy (xpath="//input[@id='kvaSlot4']")
	private WebElement Slot4TimeKVA;
	
	@FindBy (xpath="//span[@id='lblSubmit']")
	private WebElement SubmitButton;
	
	public EnergyBillCalculator(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driverG=driver;
		act=new Actions(driver);
		wait=new WebDriverWait(driver,10);
	}
	
	
	public void clikOnEnergyBillCalculator()
	{
		wait.until(ExpectedConditions.visibilityOf(EnergyBillCalculator));
		EnergyBillCalculator.click();
	}
	
	public void SupplyTypDropdown()
	{
		Select s =new Select(SupplyTypDropdown);
		s.selectByIndex(1);
	}
	
	public void tariffDropdown()
	{
		Select s =new Select(tariffDropdown);
		s.selectByIndex(1);
	}
	
	public void VoltgeDropdown()
	{
		Select s =new Select(tariffDropdown);
		s.selectByIndex(1);
	}
	
	public void sendKeysContactDemond()
	{
		ContactDemond.sendKeys("12");
	}
	
	public void sendKeysSlot1TimeKVAh()
	{
		Slot1TimeKVAh.sendKeys("20");
	}
	
	public void sendKeysSlot1TimeKVA()
	{
		Slot1TimeKVA.sendKeys("25");
	}
	
	public void sendKeysSlot2TimeKVAh()
	{
		Slot2TimeKVAh.sendKeys("30");
	}
	
	public void sendKeysSlot2TimeKVA()
	{
		Slot2TimeKVA.sendKeys("35");
	}
	
	public void sendKeysSlot3TimeKVAh()
	{
		Slot3TimeKVAh.sendKeys("40");
	}
	
	public void sendKeysSlot3TimeKVA()
	{
		Slot3TimeKVA.sendKeys("45");
	}
	
	public void sendKeysSlot4TimeKVAh()
	{
		Slot4TimeKVAh.sendKeys("50");
	}
	
	public void sendKeysSlot4TimeKVA()
	{
		Slot4TimeKVA.sendKeys("55");
	}
	
	public void clikOnSubmitButton()
	{
		SubmitButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
