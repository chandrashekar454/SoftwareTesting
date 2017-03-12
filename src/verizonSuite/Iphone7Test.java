package verizonSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Iphone7Test {
  @Test
  public void OpenURLVerizon() {
	  System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.verizonwireless.com/");
	  driver.findElement(By.xpath(".//*[@id='vgn_q']")).sendKeys("iphone 7");
	  driver.findElement(By.xpath(".//*[@id='vgn_search_btn']")).click();
	  
  }

  
  
}
