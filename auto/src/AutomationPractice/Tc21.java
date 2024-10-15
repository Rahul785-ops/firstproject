package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc21 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("//a[@href=\"/products\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"/product_details/1\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Rahul Pratap Singh");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("rahul09feb1995@gmail.com");
		driver.findElement(By.xpath("//textarea[@id=\"review\"]")).sendKeys("Product is very good");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
		
		
		
	

	}

}
