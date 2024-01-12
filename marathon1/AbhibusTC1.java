package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhibusTC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 01) Launch Firefox / Chrome / Safari / Edge  
02) Load https://www.abhibus.com/
  Add  implicitlyWait -  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
03) Type "Chennai" in the FROM text box
04) Click the first option from the pop up box
05) Type "Bangalore" in the TO text box
06) Click the first option from the pop up box
07) Select tomorrow's date in the Date field and click on search button
08) Print the name of the first resulting bus (use .getText())
09) Choose SLEEPER in the left menu from Bus Type
10) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
11) Click Show Seats
12) Choose any one Available seat
13) Select the first resulting checkbox from the Boarding Point and Dropping Point
14) Print Seats Selected ,Total Fare
15) Get the Title of the page(use .getTitle())
16) Close the browser
 */
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//input[@placeholder = 'From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.linkText("Tomorrow")).click();
		String firstBusName = driver.findElement(By.xpath("(//h5[@class = 'title'])[1]")).getText();
		System.out.println("First Bus Name: " +firstBusName);
		driver.findElement(By.linkText("Sleeper")).click();
		String seatsAvailable = driver.findElement(By.xpath("(//small[text()=' Seats Available'])[1]")).getText();
		System.out.println("Seats Available: " +seatsAvailable);
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
        driver.findElement(By.xpath("//button[@class='seat sleeper']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		String seatSelected = driver.findElement(By.xpath("//span[text()='Seat Selected :']")).getText();
		System.out.println("Seat Selected: " +seatSelected);
        String baseFare = driver.findElement(By.xpath("//span[text()='Base Fare :']")).getText();
		System.out.println("Base Fare: " +baseFare);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		
	

		}
}


