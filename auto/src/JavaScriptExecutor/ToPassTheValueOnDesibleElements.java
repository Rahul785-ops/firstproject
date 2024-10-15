package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPassTheValueOnDesibleElements {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.jquerymobile.com/1.4.5/forms-disabled/");
		WebElement text =driver.findElement(By.name("textinput-1"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value= 'rahul pratap singh'",text);
		Thread.sleep(2000);
		WebElement text2 =driver.findElement(By.linkText("Home"));

		js.executeScript("arguments[0].click()",text2);

		//driver.findElement(By.xpath("//a[@href=\".././\"]")).click();
		
				
		

	}

}
