package AutomationProject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreanShot {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.jquerymobile.com/1.4.5/forms-disabled/");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File ("./Screanshot/FirstScreenshot.png");
		Files.copy(source,dest);
		
		
		
		
		
		
		
		

	}

}
