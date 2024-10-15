package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc11 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("(//a[@href=\"/view_cart\"])[1]")).click();
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(202, 9239)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"susbscribe_email\"]")).sendKeys("rahul09feb1995@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]")).click();
		

	}

}
