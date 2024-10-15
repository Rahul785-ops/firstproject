package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc19 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("//a[@href=\"/products\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"/brand_products/Polo\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"/brand_products/H&M\"]")).click();
		
		

	}

}
