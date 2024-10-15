package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc20 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("//a[@href=\"/products\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Blue Top");
		driver.findElement(By.xpath("//button[@id=\"submit_search\"]")).click();
		driver.findElement(By.xpath("(//a[@class=\"btn btn-default add-to-cart\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-dismiss=\"modal\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"/view_cart\"])[1]")).click();
		driver.findElement(By.xpath("(//a[@href=\"/login\"])[1]")).click();
		driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys("rahul09feb1995@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys("Rahul@123");
		driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"/view_cart\"])[1]")).click();
		
		

	}

}
