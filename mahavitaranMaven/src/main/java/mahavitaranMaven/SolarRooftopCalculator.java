package mahavitaranMaven;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SolarRooftopCalculator {
	
	private WebDriver driverG;
	private Actions act;
	private WebDriverWait wait;
	
	@FindBy (xpath="//h5[text()='Solar Rooftop']")
	private WebElement SolarRooftop;
	
	@FindBy (xpath="(//a[text()='Solar Calculator'])[2]")
	private WebElement SolarCalculator;
	
	@FindBy (xpath="//span[text()='Solar Rooftop Calculator']")
	private WebElement TextSolarRoofTopCalcy;
	
	@FindBy (xpath="//input[@id='checkbox_fill_one']")
	private WebElement TotalAreaCheckbox;
	
	@FindBy (xpath="(//input[@name='radio_gp'])[2]")
	private WebElement SqFtCheckbox;
	
	@FindBy (xpath="//input[@id='roof_area_percentage_txt']")
	private WebElement RoofArea;
	
	@FindBy (xpath="//select[@id='state']")
	private WebElement StateDropdown;
	
	@FindBy (xpath="//select[@id='customer_type']")
	private WebElement CustomerDropdown;
	
	@FindBy (xpath="//input[@id='electricity_txt']")
	private WebElement AvgElectricityCost;
	
	@FindBy (xpath="//input[@id='submit']")
	private WebElement Calculate;
	
	
   public SolarRooftopCalculator(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
	   act=new Actions(driver);
	   wait=new WebDriverWait(driver,10);
	   
   }
   
   public void clikOnSolarRooftop()
   {
	   act.moveToElement(SolarRooftop).click().perform();
   }
   
   public void scrollby()
   {
	     JavascriptExecutor js=(JavascriptExecutor)driverG;
		 js.executeScript("window.scrollBy(0,200)");
   }
   
   
   public void clikOnSolarCalculator()
   {
	   SolarCalculator.click();
   }
   
   public String GetTextSolarRoofTopCalcy()
   {
	   String text=TextSolarRoofTopCalcy.getText();
	   System.out.println(text);
	   return text;
   }
   
   public void cliOnTotalAreaCheckbox()
   {
	   TotalAreaCheckbox.click();
   }
   
   public void clikOnSqFtCheckbox()
   {
	   SqFtCheckbox.click();
   }
   
   public void sendKeysRoofArea()
   {
	   RoofArea.sendKeys("42");
   }
   
   public void StateDropdown()
   {
	   Select s=new Select(StateDropdown);
	   s.selectByValue("27");
   }
   
   public void CustomerDropdown()
   {
	   Select s=new Select(CustomerDropdown);
	   s.selectByVisibleText("Residential");
   }
   
   public void sendKeysAvgElectricityCost()
   {
	   AvgElectricityCost.sendKeys("8");
   }
   
   public void clikOnCalculate()
   {
	   Calculate.click();
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
