package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Locate the username field
		WebElement username = driver.findElement(By.id("username"));
		
		//Enter the username as demosalesmanager
		username.sendKeys("demosalesmanager");
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
	/*	//get the title
		String title = driver.findElement(By.tagName("title")).getText();
		System.out.println(title);
	*/	
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Locate and click the crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		String myHomePageTitle = driver.getTitle();
		if(myHomePageTitle.contains("My Home")) {
			System.out.println("My Homepage Verified Successfully");
		}
			else {
				System.out.println("Unable to verify my Homepage");
			}
				
		}
		
		
		
	}


