package Basicss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


import static org.junit.Assert.assertTrue;


import static org.junit.Assert.assertTrue;

public class Class2Child extends Class1Parent {
	public void wait1()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		// WebDriver driver;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		// WebDriver driver1 = new FirefoxDriver();
		Class1Parent obj = new Class1Parent();
		WebDriver driver = obj.browse();

		// System.out.println(obj.browse());
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("chah");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		Class2Child wait2 = new Class2Child();
		wait2.wait1();
		driver.navigate().back();
		//driver.navigate().refresh();
		wait2.wait1();
		System.out.println(driver.getTitle());
		assertTrue("incorecctttt",driver.getTitle().equals("Facebook - Log In or Sign Up"));
		//driver.navigate().forward();
		
		//driver.wait(10l, 3000);
//		/WebElement e = wait.until

		// Select dropdown = new
		// Select(obj.driver.findElement(By.xpath(".//*[@id='day']")));

	}

}
