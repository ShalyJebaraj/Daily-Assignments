package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Testcase:3(Amazon)
===============
01) Launch Chrome  
02) Load https://www.amazon.in/
     add  implicitlyWait
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
03) Type "Bags for boys" in the Search box
04) Choose the 	 item in the result (bags for boys)
05) Print the total number of results (like 50000)
    1-48 of over 50,000 results for "bags for boys"
06) Select the first 2 brands in the left menu
    (like American Tourister, Generic)
07) Choose New Arrivals (Sort)
08) Print the first resulting bag info (name, discounted price)
09) Get the page title and close the browser(driver.close())
 */
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bag for Boys"+Keys.ENTER);
		String fetchResult = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println("Fetched Result Count: " +fetchResult);
		driver.findElement(By.xpath("(//span[@class='a-label a-checkbox-label'])[3]"));
		driver.findElement(By.xpath("(//span[@class='a-label a-checkbox-label'])[4]"));
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String productName = driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")).getText();
		System.out.println("Product Name: " +productName);
		String discountedPrice = driver.findElement(By.xpath("//div[@class='a-row']")).getText();
		System.out.println("Discounted Price: " +discountedPrice);
		
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
