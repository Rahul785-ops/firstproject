package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	WebDriver driver;
    
	@Test(priority = 1)
    public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 3)
	void enter_email()
	{
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("rajeshyadav14112@gmail.com");
	}
	
	@Test(priority = 2)
	void enter_name()
	{
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rajesh yadav");
	}
	@Test(priority = 4)
	void enter_signup()
	{
		driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
	}
	
	@Test(priority = 5)
	void teardown()
	{
		driver.close();
	}
}