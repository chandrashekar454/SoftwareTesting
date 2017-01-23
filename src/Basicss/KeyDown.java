package Basicss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://stackoverflow.com/questions/tagged/java");
		Actions abc= new Actions(driver);
		
		WebElement s= driver.findElement(By.xpath(".//*[@id='search']/input"));
		abc.keyDown(Keys.SHIFT).moveToElement(s).sendKeys("chandhu").build().perform();
		abc.contextClick(s).build().perform();
		
				}

}
