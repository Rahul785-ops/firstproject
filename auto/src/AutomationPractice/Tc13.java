package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc13 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("//a[@href=\"/product_details/1\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"quantity\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"quantity\"]")).sendKeys("4");
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//u[\"@View Cart\"]")).click();
		
		

	}

}
