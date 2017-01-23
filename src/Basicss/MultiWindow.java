package Basicss;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F");
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		System.out.println(driver.getTitle());
		System.out.println("Before switching");
		Set<String> my=driver.getWindowHandles();
		Iterator<String> it=my.iterator();
		String parentId = it.next();
		String childId = it.next();
		System.out.println(childId);
		Thread.sleep(3000);
		driver.switchTo().window(parentId).findElement(By.xpath(".//*[@id='wrapper']/div[1]/div/img")).click();
		Thread.sleep(3000);
		driver.switchTo().window(childId).findElement(By.xpath(".//*[@id='gb']/div[2]/div[1]/div[2]/div/a/span")).click();
		
		//driver.findElement(By.xpath("html/body/div[2]/div[2]/section/div/article/section/div/div[1]/a")).click();
		
	}

}
