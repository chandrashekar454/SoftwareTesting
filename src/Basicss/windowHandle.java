package Basicss;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;
 

public class windowHandle {

	 
		/**
		* @param args
		*/
		public static void main(String[] args) {
	 
			FirefoxDriver Driver = new FirefoxDriver();
	 
			String url = "http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open";
	 
			//To maximise the browser
			Driver.manage().window().maximize();
	 
			Driver.manage().deleteAllCookies();
	 
			Driver.get(url);
	 
			String parentWindow = Driver.getWindowHandle();
	 
			System.out.println("Parent window Id is : "+ parentWindow);
	 
			Driver.switchTo().frame("iframeResult");
	 
			Driver.findElement(By.tagName("button")).click();
	 
			String childWindow;
	 
			//Get Window Handle returns a set with session Id's of all the windows
	 
			childWindow = Driver.getWindowHandles().toArray()[1].toString();
	 
			Driver.switchTo().window(childWindow);
	 
			System.out.println("Title of child window is : "+ Driver.getTitle());
	 
			Driver.close();
	 
			Driver.switchTo().window(parentWindow);
	 
			System.out.println("Title of Parent wind is : "+ Driver.getTitle());
			Driver.quit();
	 
		}
	 
	
	
}
