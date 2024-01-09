package week2.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	/*	//To execute the launch browser without warning, use chrome & binary version of 115
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriverFiles\\120\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setBinary(""); //use the binary version's link's path
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option); //(Launch Browser by older method)
		
		*/
		
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		
		
		
		
		//FirefoxDriver fd = new FirefoxDriver();
		//SafariDriver sd = new SafariDriver();
		
		
		//To Load the URL
		//driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		
		//To maximize the window/Browser
		driver.manage().window().maximize();
		
		//To wait for 2sec --> Java wait
		Thread.sleep(2000);
		
		//To Close the window
		driver.close();
		
		
		
		
	}

}
