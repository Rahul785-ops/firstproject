package AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Rahul Pratap Singh");
		
		driver.findElement(By.xpath("(//input[@type=\"email\"])[2]")).sendKeys("rahul09feb1995@gmail.com");
		
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		
		driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Rahul@123");
		
		driver.findElement(By.xpath("//select[@name=\"days\"]")).sendKeys("9");
		
		driver.findElement(By.xpath("//select[@name=\"months\"]")).sendKeys("February");
		
		driver.findElement(By.xpath("//select[@data-qa=\"years\"]")).sendKeys("1994");
		
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
		
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"first_name\"]")).sendKeys("Rahul");
		
		driver.findElement(By.xpath("//input[@id=\"last_name\"]")).sendKeys("Thakur");
		
		driver.findElement(By.xpath("//input[@id=\"company\"]")).sendKeys("Ducat");
		
		driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("Noida Sector 121");
		
		driver.findElement(By.xpath("//input[@name=\"address2\"]")).sendKeys("Gadi gool chakkar");
		
		//driver.findElement(By.xpath("name=\"country\"")).sendKeys("india");
		
		driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("Uttar Pradesh");
		
		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("Noida");
		
		driver.findElement(By.xpath("//input[@data-qa=\"zipcode\"]")).sendKeys("243006");
		
		driver.findElement(By.xpath("//input[@name=\"mobile_number\"]")).sendKeys("9319626587");
		
		driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();
		
		driver.findElement(By.xpath("//a[@data-qa=\"continue-button\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
		driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]")).sendKeys("Karan");
		driver.findElement(By.xpath("(//input[@type=\"email\"])[2]")).sendKeys("rahul09feb1995@gmail.com");
		driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
		
		
		

	    driver.findElement(By.xpath("//a[@href=\"/delete_account\"]")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys("gfkdasf@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys("1234567");
		driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();
		

		
		
	   // driver.close();
		
		
		
		
		

	}

}
