package Basicss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1Parent {

	public WebDriver browse() {

		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		driver.get("http://www.facebook.com");
		return driver;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// driver.get("http://www.tizag.com/javascriptT/javascriptheadnbody.php");

	}

}
