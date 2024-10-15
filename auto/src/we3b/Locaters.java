package we3b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//locator id is used below
//	driver.findElement(By.id("twotabsearchtextbox")).click();
		
	// Locator name is used below
		//driver.findElement(By.name("field-keywords")).click();
		
		//locator "class name" is used below
		//driver.findElement(By.className("_ap3a _aaco _aacw _aad0 _aad7")).click();
		
		//locator "link text" is used below
	//	driver.findElement(By.linkText("Customer Service")).click();
		
		// locator "partial link" is used blow
		//driver.findElement(By.partialLinkText("Amazon mi")).click();
		
		driver.findElement(By.xpath("//a[text()=\"Sell\"]")).click();
		
		
	    Thread.sleep(3000);
		
		driver.close();

	}

}
