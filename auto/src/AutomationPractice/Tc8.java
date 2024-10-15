package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc8 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("//a[@href=\"/products\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"/product_details/1\"]")).click();
		

	}

}
