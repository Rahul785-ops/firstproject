package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys("rahul09feb1995@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys("Rahul@123");
		driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"/delete_account\"]")).click();
		driver.findElement(By.xpath("//a[@data-qa=\"continue-button\"]")).click();
		
		
		

	}

}
