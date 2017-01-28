package Basicss;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class NewTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandrashekarChary\\Downloads\\chromedriver.exe");
		
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lowes.com/");
		//Thread.sleep(5000);
		
		//driver.get("http://demoqa.com/draggable/");
		//List ch = driver.findElements(By.xpath(".//*[@id='main']/div[1]/div/header/div[2]/div/div[1]/nav/ul/li"));
		//ch.selectByIndex(5);
		//for
		
		
		
		List<WebElement> my = driver.findElements(By.xpath(".//*[@id='main']/div[1]/div/header/div[2]/div/div[1]/nav/ul/li/ul/li"));
		//Thread.sleep(5000);
		//my.get(5);
		//driver.findElement(By.xpath((my.get(5)).toString())).click();
		
		//System.out.println(ch.getAllSelectedOptions());
		System.out.println(my.size());
		System.out.println(my.get(5).getText());
		driver.findElement(By.linkText((my.get(5).getText()).toString())).click();
		driver.findElement(By.xpath(".//*[@id='search-query']")).sendKeys("mat");
		driver.findElement(By.xpath(".//*[@id='frmQuickSearch']/div/div/span[1]/button[2]")).click();
		
		
	
		//Actions my = new Actions(driver);
		
		//my.clickAndHold(driver.findElement(By.id("draggable"))).build().perform();
	
		//my.moveByOffset(150, 120).build().perform();;
		//my.moveToElement(driver.findElement(By.xpath(".//*[@id=breadcrumbs]")));
		
		
		//driver.findElement(By.id("draggable")).click();
		
		
	}
	
	
	
	
	
}
	
	

