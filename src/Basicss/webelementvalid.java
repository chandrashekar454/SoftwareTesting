package Basicss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class webelementvalid {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

		driver.get("http://www.delta.com/");
		boolean s = driver.findElement(By.xpath(".//*[@id='returnDate']")).isDisplayed();
		System.out.println(s);
		driver.findElement(By.xpath(".//*[@id='oneWayBtn']")).click();
		System.out.println("after");
		Thread.sleep(4000L);
		s= driver.findElement(By.xpath(".//*[@id='returnDate']")).isDisplayed();
		System.out.println(s);
	}

}
