package TestNgClass;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import mahavitaranMaven.EnergyBillCalculator;
import mahavitaranMaven.HomePage;
import mahavitaranMaven.RegistrationProfilePage;
import mahavitaranMaven.SolarRooftopCalculator;

public class VerifyallTests {
	
	private WebDriver driver;
	private HomePage homePage;
	private RegistrationProfilePage registrationProfilePage;
	private EnergyBillCalculator energyBillCalculator;
	private SolarRooftopCalculator solarRooftopCalculator;
	
	@Parameters("browser123")
	@BeforeTest
	public void LaunchBrowser(String browser)
	{
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromdriverSelenium109\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
//		if(browser.equals("edge"))
//		{
//			System.setProperty("webdriver.edge.driver","D:\\BROWSERS\\edgedriver_win64\\msedgedriver.exe");
//			WebDriver driver=new EdgeDriver();
//		}
//		if(browser.equals("Firefox"))
//		{
//			System.setProperty("webdriver.gecko.driver", "D:\\BROWSERS\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
//		}
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@BeforeClass
	public void beforeClass()
	{
		homePage=new HomePage(driver);
		registrationProfilePage=new RegistrationProfilePage(driver);
		energyBillCalculator=new EnergyBillCalculator(driver);
		solarRooftopCalculator=new SolarRooftopCalculator(driver);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.get("https://www.mahadiscom.in/en/home/");
		//driver.navigate().to("https://www.mahadiscom.in/en/home/");
	}
    
	@Test(enabled=false)
	public void test1() throws InterruptedException
	{
		 homePage.clikOnCloseButton();
		  
//		  JavascriptExecutor js=(JavascriptExecutor)driver;
//		  js.executeScript("window.scrollBy(0,50)");
		  
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
		//  registrationProfilePage.clikOnSubmitButton();
		  
		  String title=driver.getTitle();
		  System.out.println(title);
		  
		  String ActualURL=driver.getCurrentUrl();
		  String ExpectedURL="https://wss.mahadiscom.in/wss/wss?uiActionName=getCreateUpdateCustProfile_new";
		  
		  Assert.assertEquals(ActualURL, ExpectedURL);
		  
//		  ArrayList<String> addr2=new ArrayList<String>(driver.getWindowHandles());
//		  driver.switchTo().window(addr2.get(0));
		
	}
	
	@Test(enabled=false,dependsOnMethods= {"test1"})
	public void test2() throws InterruptedException
	{
		 homePage.clikOnCloseButton();
		  homePage.clikOnConsumerPortal();
		  Thread.sleep(4000);
		  ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window(addr.get(3));
	      
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	      js.executeScript("window.scrollBy(0,50)");
		  
		  homePage.clikOnAplyForNewConection();
		  Thread.sleep(4000);
		  ArrayList<String>addr1=new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(addr1.get(4));
		  
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
		  energyBillCalculator.clikOnSubmitButton();
		  
		  String ActualURL=driver.getCurrentUrl();
		  String ExpectedURL="https://wss.mahadiscom.in/wss/wss?uiActionName=getEnergyBillCalculator";
		  
		  Assert.assertEquals(ActualURL, ExpectedURL);
		  
//		  ArrayList<String> addr2=new ArrayList<String>(driver.getWindowHandles());
//		  driver.switchTo().window(addr2.get(0));
		
	}
	
	@Test//(priority=1,enabled=false)
	public void test3() throws InterruptedException 
	{
		
		  SoftAssert soft=new SoftAssert();
		  
		  homePage.clikOnCloseButton();
		  homePage.clikOnConsumerPortal();
		  Thread.sleep(4000);
		  ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window(addr.get(1));
		  homePage.MoveToElementRenewablePortal();
		  Thread.sleep(4000);
		  ArrayList<String> addr1=new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window(addr1.get(2));
	      
	      String ActualURL=driver.getCurrentUrl();
		  String ExpectedURL="https://www.mahadiscom.in/en/renewable-energy-portals/";
		  soft.assertEquals(ActualURL, ExpectedURL);
	      
	      //SolarRooftopCalculator solarRooftopCalculator=new SolarRooftopCalculator(driver);
	      solarRooftopCalculator.clikOnSolarRooftop();
	      
	      ArrayList<String> addr2=new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window(addr2.get(3));
	      
	      String ActualURL1=driver.getCurrentUrl();
		  String ExpectedURL1="https://www.mahadiscom.in/ismart/";
		  soft.assertEquals(ActualURL1, ExpectedURL1);
		  
	      // solarRooftopCalculator.scrollby();
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,200)");
	      solarRooftopCalculator.clikOnSolarCalculator();
	      
	      String ActualText= solarRooftopCalculator.GetTextSolarRoofTopCalcy();
	      String ExpectedText="Solar Rooftop Calculator";
	      soft.assertEquals(ActualText, ExpectedText);
	      
	      solarRooftopCalculator.cliOnTotalAreaCheckbox();
	      solarRooftopCalculator.clikOnSqFtCheckbox();
	      solarRooftopCalculator.sendKeysRoofArea();
	      solarRooftopCalculator.StateDropdown();
	      solarRooftopCalculator.CustomerDropdown();
	      solarRooftopCalculator.sendKeysAvgElectricityCost();
	      solarRooftopCalculator.clikOnCalculate(); 
	      
	      String ActualURL2=driver.getCurrentUrl();
		  String ExpectedURL2="https://solarrooftop.gov.in/rooftop_calculator";
		  soft.assertEquals(ActualURL2, ExpectedURL2);
		  
		 soft.assertAll();
		  
		 // Assert.assertEquals(ActualURL, ExpectedURL);
	      
//	      ArrayList<String> addr3=new ArrayList<String>(driver.getWindowHandles());
//		  driver.switchTo().window(addr3.get(0));
	}
	
	@AfterMethod
	public void afterMethod() 
	{
//		String MainBrowser=driver.getWindowHandle();
//		System.out.println(MainBrowser);
		
		ArrayList<String>addr1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr1.get(0));
		
	}
	
	@AfterClass
	public void afterClass()
	{
		homePage=null;
		registrationProfilePage=null;
		energyBillCalculator=null;
		solarRooftopCalculator=null;
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
		driver=null;
		System.gc();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
