package we3b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newprog {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//img[@alt=\"Mobiles\"]")).click();
        driver.findElement(By.linkText("Cart")).click();
       // Thread.sleep(3000);
       driver.findElement(By.linkText("Login")).click();
      // WebElement digit = driver.findElement(By.xpath("//span[contains(.,\"Login\")]"));
       
       Thread.sleep(3000);
       WebElement digit = driver.findElement(By.xpath("//input[@class=\"r4vIwl BV+Dqf\"]"));
       digit.click();
        digit.sendKeys("9319626587");
        driver.findElement(By.xpath("//button[@class=\"QqFHMw twnTnD _7Pd1Fp\"]")).click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//span[@class=\"rMF9Z9\"]")).click();
        
        
        
        
    //    Thread.sleep(3000);
      //  driver.findElement(By.linkText("Flights")).click();
        
        
        
      //  Thread.sleep(3000);
        
        
       // driver.close();
        
        
        

		
		

	}

}
