package Basicss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		/*
		driver.get("http://qaclickacademy.com");
		driver.findElement(By.xpath(".//*[@id='homepage']/header/div[2]/div/nav/ul/li[2]/a")).click();
		*/
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("ds");
		driver.findElement(By.id("day")).click();
		//driver.findElement(By.id("email")).sendKeys("chandhu454");
		//driver.findElement(By.id("pass")).sendKeys("5");
		//driver.findElement(By.id("u_0_l")).click();
	}

}
