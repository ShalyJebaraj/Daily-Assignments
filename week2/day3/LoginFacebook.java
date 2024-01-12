package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("testleaf.2023@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Tuna@321");
		driver.findElement(By.id("loginbutton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Find your account and log in.")).click();
		String forgottenPageTitle = driver.getTitle();
		if(forgottenPageTitle.contains("Forgotten")) {
			System.out.println("Forgotten Page is Verified");
			
		}

		else {
			System.out.println("Forgotten Page cannot be Verified");
		}
		
		driver.close();
	}

}
