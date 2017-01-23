package Basicss;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.tizag.com/javascriptT/javascriptheadnbody.php");
		//driver.get("http://www.facebook.com");
		driver.get("http://www.spicejet.com/");
		//driver.findElement(By.xpath(".//option[@value='3']")).click();
		
		//Dropdown kosam
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Actions nn= Actions(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")));
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		
		
		Select dropdown = new Select(driver.findElement(By.xpath("ctl00_mainContent_ddl_originStation1")));
		//WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='day']")));
		//Select dropdown2= new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		//dropdown.selectByIndex(4);
		//dropdown.deselectByVisibleText("14");
		dropdown.selectByValue("AMD");
		//driver.findElement(By.xpath(".//*[@id='u_0_h']")).click();
		//driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input")).click();
		
		
		//checkbox kosam: Is selected: to check selected or not
		//is enabled or disabled: True
		//Is enabled,Is disabled,isSelected
		
		
		
		
		//Alerts kosam
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		
		//driver.switchTo().alert().sendKeys("ok");
		
		
		//driver.findElement(By.xpath(".//input[@name='sex']")).getSize();
		//System.out.println(driver.findElement(By.xpath(".//input[@name='sex']")).get(2).click());
	}

}
