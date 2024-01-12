package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Assignment 2:Duplicate Lead 1. Launch URL
		 * "http://leaftaps.com/opentaps/control/login" 2. Enter UserName and Password
		 * Using Id Locator 3. Click on Login Button using Class Locator 4. Click on
		 * CRM/SFA Link 5. Click on Leads Button 6. Click on Create Lead 7. Enter
		 * CompanyName Field Using id Locator 8. Enter FirstName Field Using id Locator
		 * 9. Enter LastName Field Using id Locator 10. Enter FirstName(Local) Field
		 * Using id Locator 11. Enter Department Field Using any Locator of Your Choice
		 * 12. Enter Description Field Using any Locator of your choice 13. Enter your
		 * email in the E-mail address Field using the locator of your choice 14. Click
		 * on Create Button 15. Get the Title of Resulting Page using driver.getTitle()
		 * 16. Click on Duplicate button 17. Clear the CompanyName Field using .clear()
		 * And Enter new CompanyName 18.Clear the FirstName Field using .clear() And
		 * Enter new FirstName Bu 19.Click on Create Lead Button 20. Get the Title of
		 * Resulting Page using driver.getTitle()
		 */
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shaly");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jebaraj");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shaly");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Admin");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("To create lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jshally@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf1");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shaly");
		driver.findElement(By.name("submitButton")).click();
		String newPageTitle = driver.getTitle();
		System.out.println(newPageTitle);
		
	}

}
