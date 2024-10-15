package AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		driver.findElement(By.xpath("//a[@href=\"/contact_us\"]")).click();
		
		 WebElement js = driver.findElement(By.xpath("//input[@name=\"upload_file\"]"));
		 
		 JavascriptExecutor j=(JavascriptExecutor) driver;
		 j.executeScript("arguments[o].click()", js);
		//.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		

	}

}
