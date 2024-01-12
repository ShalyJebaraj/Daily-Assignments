package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/*
 * Testcase 2 (PVR cinemas)
==========
01) Launch the url  https://www.pvrcinemas.com/
02) Choose Your Location as Chennai 
03) Click  on Movie Library under hamburger button
04) Select the Genre-->Animation
05) Select the Language-->English
06) Click on Apply
07) Click on first resulting animation movie
08) Click proceed to book
09) Enter all fields  cinema , Name, date, preferred show time, no of seats, food and beverages, Email and Mobile
10) Click on copy to self 
11) Click on  Send Request
12) Click cancel 
13) Close the OTP dialog
14) Verify the title of the page		
 */
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search your city']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search city']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
        driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
        driver.findElement(By.xpath("//select[@name='genre']")).click();
        driver.findElement(By.xpath("//option[text()='ANIMATION']")).click();
        driver.findElement(By.xpath("//select[@name='lang']")).click();
        driver.findElement(By.xpath("//option[text()='ENGLISH']")).click();
        driver.findElement(By.xpath("//button[text()='Apply']")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("(//div[@class='info'])[1]")).click();
        driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
        driver.findElement(By.id("cinemaName")).click();
        driver.findElement(By.xpath("//option[text()='PVR Heritage RSL ECR Chennai']")).click();
        driver.findElement(By.xpath("//input[@class='ng-untouched ng-pristine ng-valid']")).click();
        driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();
        driver.findElement(By.xpath("//select[@name='timings']")).click();
        driver.findElement(By.xpath("//option[@value='09:00 AM - 12:00 PM']")).click();
        driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Shaly");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pvrcinema@gmail.com");
        driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("7845932181");
        driver.findElement(By.xpath("//select[@name='food']")).click();
        driver.findElement(By.xpath("//option[@value='No']")).click();
        driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("No");
        driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
        driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
        driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
        driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
        
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().contains("Movie")) {
			System.out.println("Title Verified");
		}
		else {
			System.out.println("Title Mismatch");
		}
		
		driver.close();
		
        
	}

}
