package Basicss;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class NewTest 
{
	
static WebDriver driver;

 public void elementClick(String path){
	 
	 WebDriverWait wait = new WebDriverWait(driver, 10);
	 WebElement keys = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
	 keys.click();
	 
	 
 }
 public void SendKeyMethod(String xpath, String sendData){
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath(".//*[@id='vgn_q']")).sendKeys("iphone 7");
 }
	
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
	  driver =new FirefoxDriver();
	  NewTest driverMethod = new NewTest();
	  driver.get("https://www.verizonwireless.com/");
	
	  
	  //WebElement keys = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='vgn_q']")));
	  //keys.sendKeys("iphone 7");
	  driverMethod.SendKeyMethod(".//*[@id='vgn_q']","iphone 7");
	 // driver.findElement(By.xpath(".//*[@id='vgn_q']")).sendKeys("iphone 7");
	  
	  //Search Button////////////////////////////////////////////////////////
	  driverMethod.elementClick(".//*[@id='vgn_search_btn']");
	  //driver.findElement(By.xpath(".//*[@id='vgn_search_btn']")).click();
//
//	  WebDriverWait wait = new WebDriverWait(driver, 10);
//	  WebElement keys = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='grid']/div[1]/div[3]/div[1]")));
//	  keys.click();
	  //Selecting Phone//////////////////////
	  driverMethod.elementClick(".//*[@id='grid']/div[1]/div[3]/div[1]/a");
	 // driver.findElement(By.xpath(".//*[@id='grid']/div[1]/div[3]/div[1]/a")).click();
	  //Next Step/////////////////////////////
	  driverMethod.elementClick(".//*[@id='myBtn']");
	 // driver.findElement(By.xpath(".//*[@id='myBtn']")).click();
	  
	  //New Customer////////////////////
	  driverMethod.elementClick(".//*[@id='preIntent']/div/input[1]");
	 // driver.findElement(By.xpath(".//*[@id='preIntent']/div/input[1]")).click();
	  
	  //add Cart and selection plan///////////////
	  driverMethod.elementClick(".//*[@id='submit-btn']");
	  //driver.findElement(By.xpath(".//*[@id='submit-btn']")).click();
	  
	  //Add plan to cart./////////////////////////
	  driverMethod.elementClick(".//*[@id='sidebar-container']/div/section/div[5]/div/div[1]/button");
	  
	  //driver.findElement(By.xpath(".//*[@id='sidebar-container']/div/section/div[5]/div/div[1]/button")).click();
	  
	  //Check out Button//////////////////////////
	  driverMethod.elementClick(".//*[@id='costSummary']/div[1]/a[2]");
	 // driver.findElement(By.xpath(".//*[@id='costSummary']/div[1]/a[2]")).click();
	  
	  driverMethod.SendKeyMethod("", "");
	  driver.findElement(By.xpath(".//*[@id='CheckoutShip-firstName']")).sendKeys("abc");
	  driver.findElement(By.xpath(".//*[@id='CheckoutShip-lastName']")).sendKeys("def");
	  driver.findElement(By.xpath(".//*[@id='CheckoutShipEmail']")).sendKeys("abcdef445544@gmail.com");
	  driver.findElement(By.xpath(".//*[@id='CheckoutShip-address1']")).sendKeys("1234 washington rd");
	  driver.findElement(By.xpath(".//*[@id='CheckoutShip-city']")).sendKeys("Piscataway");
	  driver.findElement(By.xpath(".//*[@id='CheckoutCustomerPhone']")).sendKeys("903-910-8797");
	
	  //Select drop = new Select(driver.findElement(By.xpath(".//*[@id='Checkout-Shipping-and-Services']/fieldset[3]/div[4]/div[2]/div[1]/div/a")));
	  //drop.selectByVisibleText("AL");
	  
	  //Select dropdownState = new Select(driver.findElement(By.xpath(".//*[@id='Checkout-Shipping-and-Services']/fieldset[3]/div[4]/div[2]/div[1]/div/a")));
	  //dropdownState.selectByVisibleText("AL");
	  //Continue Next Step///////////////////////
	  driverMethod.elementClick(".//*[@id='Checkout-Shipping-and-Services']/div[2]/fieldset/div/input[1]");
//	  Select dropdownState = new Select(driver.findElement(By.xpath(".//*[@id='Checkout-Shipping-and-Services']/fieldset[3]/div[4]/div[2]/div[1]/div/a")));
//	  dropdownState.selectByVisibleText("AL");
	 // driver.findElement(By.xpath(".//*[@id='vgn_q']")).sendKeys("iphone 7");
	  
  }
}
