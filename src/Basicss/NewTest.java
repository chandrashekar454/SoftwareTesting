package Basicss;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import org.openqa.selenium.*;



public class NewTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("loginbutton")).click();
		
	}
	
	
	
	
	
}
	
	

