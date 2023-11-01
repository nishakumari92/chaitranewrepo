package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Step 1: Launch the Browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step 2: Load the Application
		driver.get("http://localhost:8888");
		
		//Step 3: Login to Application
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager");
		driver.findElement(By.id("submitButton")).click();
		
		//Step 4: Navigate to Contacts LInk
		driver.findElement(By.linkText("Contacts")).click();
		
		//Step 5: Click on create conatct look up Image
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		//Step 6: create conatct
		driver.findElement(By.name("lastname")).sendKeys("Chaitra");
		
		//Step 7: Save
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		//Step 8: Validate
		String contactHeader = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		
		if(contactHeader.contains("Chaitra"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		
		//Step 9: Logout
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Sign Out")).click();
		
		System.out.println("SignOut successful");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
