package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc16 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys("rahul09feb1995@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys("Rahul@123");
		driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();
		driver.findElement(By.xpath("(//a[@class=\"btn btn-default add-to-cart\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]")).click();
		driver.findElement(By.xpath("(//a[@class=\"btn btn-default add-to-cart\"])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"/view_cart\"])[1]")).click();
		driver.findElement(By.xpath("//a[@class=\"btn btn-default check_out\"]")).click();
		driver.findElement(By.xpath("//textarea[@class=\"form-control\"]")).sendKeys("Good Morning to all");
		driver.findElement(By.xpath("//a[@class=\"btn btn-default check_out\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"name_on_card\"]")).sendKeys("Rahul Pratap Singh");
		driver.findElement(By.xpath("//input[@name=\"card_number\"]")).sendKeys("9319626587");
		driver.findElement(By.xpath("//input[@name=\"cvc\"]")).sendKeys("733");
		driver.findElement(By.xpath("//input[@name=\"expiry_month\"]")).sendKeys("02");
		driver.findElement(By.name("expiry_year")).sendKeys("2025");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.xpath("//a[@href=\"/delete_account\"]")).click();
		driver.findElement(By.linkText("Continue")).click();
	
		
	}

}
