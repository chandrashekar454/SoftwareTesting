package Basicss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Csspath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("chandhu454");
		driver.findElement(By.cssSelector(".inputtext _58mg _5dba _2ph-")).sendKeys("chandhu454");
		

	}

}
