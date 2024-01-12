package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		String myHomePageTitle = driver.getTitle();
		if(myHomePageTitle.contains("My Home")) {
			System.out.println("My Homepage Verified Successfully");
		}
			else {
				System.out.println("Unable to verify my Homepage");
			}
		//Click on the Lead's Tab
		driver.findElement(By.linkText("Leads"));
		
		//click on the Create Link Tab
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the company name as Testleaf
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		//Enter the First Name 
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shaly");
		
		//Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jebaraj");
		
		//Locate the Source DD
		WebElement sourceWE = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select sourceDD = new Select(sourceWE);
		
		sourceDD.selectByIndex(4); //Employee --> by index
		
		//Locate the Industry DD
		WebElement industryWE = driver.findElement(By.id("createLeadForm_industryEnumId"));
		
		//Instantiate the select class for industryWE
		Select industryDD = new Select(industryWE);
		industryDD.selectByValue("IND_SOFTWARE"); //choose Computer software using value
		
		//Locate the Ownership DD
		WebElement ownershipWE = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipDD = new Select(ownershipWE);
		ownershipDD.selectByVisibleText("Partnership");//choose Partnership by  visible text
		
		
		/*
		//Click on the CreateLead button
		driver.findElement(By.name("submitButton")).click();
		
		//Get Lead Id
		String leadIdWithCname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String leadID = leadIdWithCname.replaceAll("[^0-9]", "");
		System.out.println("The Lead ID is: " +leadID);
		
		driver.close();
	*/	
	
	}

}
