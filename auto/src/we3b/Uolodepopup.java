package we3b;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uolodepopup {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//h2[@class='main-3'])[1]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']")).click();
	
		 Runtime.getRuntime().exec("./autoit/uplode.exe");
		 
		 

	}

}
