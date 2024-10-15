package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc18 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("(//a[@data-parent=\"#accordian\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"/category_products/1\"]")).click();
		driver.findElement(By.xpath("(//a[@data-toggle=\"collapse\"])[2]")).click();
		driver.findElement(By.xpath("//a[@href=\"/category_products/3\"]")).click();
		
		

	}

}
