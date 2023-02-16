package Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import mahavitaranMaven.EnergyBillCalculator;
import mahavitaranMaven.HomePage;
import mahavitaranMaven.RegistrationProfilePage;
import mahavitaranMaven.SolarRooftopCalculator;

public class VerifyRegistrationPage {
	
  public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver","D:\\chromdriverSelenium109\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.mahadiscom.in/en/home/");
	  
	  HomePage homePage=new HomePage(driver);
	  
	  homePage.clikOnCloseButton();
	  
//	  JavascriptExecutor js=(JavascriptExecutor)driver;
//	  js.executeScript("window.scrollBy(0,50)");
	  
	  homePage.clikOnConsumerPortal();
	  Thread.sleep(4000);
	  ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(addr.get(1));
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0,50)");
	  
	  homePage.clikOnAplyForNewConection();
	  Thread.sleep(4000);
	  ArrayList<String> addr1=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(addr1.get(2));
	  
	  RegistrationProfilePage registrationProfilePage=new RegistrationProfilePage(driver);
	  registrationProfilePage.clikOnregistration();	 
	  registrationProfilePage.sendKeysConsumerName();
	  registrationProfilePage.sendKeysMobileNumber();
	  registrationProfilePage.sendKeysEmail();
	  registrationProfilePage.sendKeysLogInName();
	  registrationProfilePage.sendKeysPassword();
	  registrationProfilePage.sendKeysConfirmPassword();
	  registrationProfilePage.clikOnSubmitButton();    
	  
	  //testCase2

	/*	 HomePage homePage=new HomePage(driver);
		  homePage.clikOnCloseButton();
		  homePage.clikOnConsumerPortal();
		  Thread.sleep(4000);
		  ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window(addr.get(1));
		  
		  homePage.clikOnAplyForNewConection();
		  Thread.sleep(4000);
		  ArrayList<String>addr1=new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(addr1.get(2));
		  
		  EnergyBillCalculator energyBillCalculator=new EnergyBillCalculator(driver);
		  energyBillCalculator.clikOnEnergyBillCalculator();
		  energyBillCalculator.SupplyTypDropdown();
		  energyBillCalculator.tariffDropdown();
		  energyBillCalculator.VoltgeDropdown();
		  energyBillCalculator.sendKeysContactDemond();
		  energyBillCalculator.sendKeysSlot1TimeKVAh();
		  energyBillCalculator.sendKeysSlot1TimeKVA();
		  energyBillCalculator.sendKeysSlot2TimeKVAh();
		  energyBillCalculator.sendKeysSlot2TimeKVA();
		  energyBillCalculator.sendKeysSlot3TimeKVAh();
		  energyBillCalculator.sendKeysSlot3TimeKVA();
		  energyBillCalculator.sendKeysSlot4TimeKVAh();
		  energyBillCalculator.sendKeysSlot4TimeKVA();
		  energyBillCalculator.clikOnSubmitButton();   */
		  
		  
		//  testCase3
		  

	/*	  HomePage homePage=new HomePage(driver);
		  homePage.clikOnCloseButton();
		  homePage.clikOnConsumerPortal();
		  Thread.sleep(4000);
		  ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window(addr.get(1));
		  homePage.MoveToElementRenewablePortal();
		  Thread.sleep(4000);
		  ArrayList<String> addr1=new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window(addr1.get(2));
	      
	      SolarRooftopCalculator solarRooftopCalculator=new SolarRooftopCalculator(driver);
	      solarRooftopCalculator.clikOnSolarRooftop();
	      
	      ArrayList<String> addr2=new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window(addr2.get(3));
	      
	      solarRooftopCalculator.scrollby();
	      solarRooftopCalculator.clikOnSolarCalculator();
	      solarRooftopCalculator.GetTextSolarRoofTopCalcy();
	      solarRooftopCalculator.cliOnTotalAreaCheckbox();
	      solarRooftopCalculator.clikOnSqFtCheckbox();
	      solarRooftopCalculator.sendKeysRoofArea();
	      solarRooftopCalculator.StateDropdown();
	      solarRooftopCalculator.CustomerDropdown();
	      solarRooftopCalculator.sendKeysAvgElectricityCost();
	      solarRooftopCalculator.clikOnCalculate(); */
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
}

}
