package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc10 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		JavascriptExecutor scroll= (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(202, 9239)");
		driver.findElement(By.xpath("//input[@id=\"susbscribe_email\"]")).sendKeys("rahul09feb1995@gmail.com");
		driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]")).click();
		

	}

}
