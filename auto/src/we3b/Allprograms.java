package we3b;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Allprograms {

	public static void main(String[] args) throws InterruptedException {
		
           EdgeDriver driver = new EdgeDriver();
           driver.manage().window().fullscreen();
           Thread.sleep(3000);
           
           driver.get("https://www.flipkart.com/");
           driver.findElement(By.xpath("(//a[@class='_1ch8e_'])[2]")).click();
           
         //  Thread.sleep(3000);
           driver.manage().window().maximize();
           //Thread.sleep(3000);

          driver.navigate().back();
          //Thread.sleep(3000);
          driver.navigate().forward();
          // Thread.sleep(3000);
          driver.navigate().refresh();
         // Thread.sleep(3000);
           driver.navigate().to("https://www.instagram.com/");
          // Thread.sleep(3000);
           driver.navigate().back();
         // Dimension dim = new Dimension(500, 500);
         // driver.manage().window().setSize(dim);
          
          System.out.println("position of page = "+driver.manage().window().getPosition());
          driver.manage().window().setPosition(new Point(200,70));
        
           
          // EdgeDriver driver1=new EdgeDriver();
           
         //  driver1.get("https://www.instagram.com/");
           
           Thread.sleep(3000);
           
      //     System.out.println(driver.getTitle());
       //    System.out.println(driver.getCurrentUrl());
         //  System.out.println(driver.manage().window().getSize());
           driver.close();
          // driver1.close();
           
           
           
	}

}
