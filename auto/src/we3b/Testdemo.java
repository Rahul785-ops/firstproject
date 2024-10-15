package we3b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testdemo {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver= new ChromeDriver();
	//this side is redirect to new page
	//driver.get("https://blog.sentry.io/");
//	driver.findElement(By.xpath("(//span[text()='Blog'])[1]")).click();
 	driver.get("https://www.amazon.in/");
	
	
	WebDriver	driver1= new EdgeDriver();

	driver1.get("https://www.flipkart.com/");

//	Thread.sleep(3000);
	
	//this is used to get url of current page
//	String actualUrl= driver.getCurrentUrl();
//	System.out.println(driver.getCurrentUrl());
	
   //this is used to get title of the current page

//	System.out.println(driver.getTitle());
	//To get source of current page
	
//	System.out.println(driver.getPageSource());
//	driver.close();
	
	driver.quit();
	driver1.quit();
	

	}
	
}
