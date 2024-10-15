package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc17 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("(//a[@class=\"btn btn-default add-to-cart\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]")).click();
		driver.findElement(By.xpath("(//a[@class=\"btn btn-default add-to-cart\"])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"/view_cart\"])[1]")).click();
		driver.findElement(By.xpath("(//a[@style=\"cursor: pointer;\"])[1]")).click();
		
		

	}

}
