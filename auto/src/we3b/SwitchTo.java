package we3b;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		driver.get("https://blog.sentry.io/");
       driver.findElement(By.xpath("(//span[text()='Blog'])[1]")).click();
   //     String page1 = driver.getWindowHandle();
   //     Set<String> page2 = driver.getWindowHandles();
        
   //     for (String x:page2)
   //     {
    //    	if(!x.equalsIgnoreCase(page1))
    ////    	{
     //   		driver.switchTo().window(x);
     //   		break;
     //   	}
     //   }
        
        
      //  driver.switchTo().frame(tab);
        driver.findElement(By.xpath("// span[@class='primary-dark css-17qgsod e1of9yu11']")).click();
        driver.findElement(By.xpath("(//span[@class='silent css-17qgsod e1of9yu11'])[34]")).click();
       


		

	}

}
