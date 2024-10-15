package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class ToPerformAction_On_DisableElement {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
		//to scroll down at bottom
			jsExecutor.executeScript("window.scrollBy(0, document.body.scrollHeight)");
			jsExecutor.executeScript("window.scrollBy(0,300)");
			Thread.sleep(2000);
			jsExecutor.executeScript("window.scrollBy(0,-300)");
			
	
			
			

	}

}
