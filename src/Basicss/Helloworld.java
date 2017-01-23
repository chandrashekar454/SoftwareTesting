package Basicss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Helloworld {
	public static void main(String[] args){
	
	System.out.println("hello world");

	System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandrashekarChary\\Downloads\\chromedriver.exe");
	System.setProperty("webdriver.edge.driver", "C:\\Users\\ChandrashekarChary\\Downloads\\MicrosoftWebDriver.exe");
	//MicrosoftWebDriver.exe
	//webdriver.edge.driver
	WebDriver driver= new EdgeDriver();
	
	driver.get("http://www.facebook.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());
	System.out.println(driver.getCurrentUrl());
	driver.quit();
	
	}
	
	

}
