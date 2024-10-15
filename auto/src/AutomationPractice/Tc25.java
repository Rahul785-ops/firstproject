package AutomationPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tc25 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		
		

	}

}
