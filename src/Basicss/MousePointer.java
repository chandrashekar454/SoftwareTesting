package Basicss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MousePointer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","C://geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandrashekarChary\\Downloads\\chromedriver.exe");
		
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://www.spicejet.com/");
		Thread.sleep(10000);
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")));
		//driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		Thread.sleep(5000);
		//dropdown.selectByValue("AMD");
		//driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[4]/a")).click();
		Actions myaction = new Actions(driver);
		WebElement element=driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[1]"));
		//WebElement element2=driver.findElement(By.xpath(".//*[@id='nav-link-prime']/span[2]"));
		myaction.moveToElement(element).build().perform();
		//myaction.moveToElement(element2).build().perform();
	}

}
