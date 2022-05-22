//Assignment 2:Edit Lead
//		  1. Launch URL "http://leaftaps.com/opentaps/control/login"
//		  2. Enter UserName and Password Using Id Locator
//		  3. Click on Login Button using Class Locator
//		  4. Click on CRM/SFA Link
//		  5. Click on Leads Button
//		  6. Click on Create Lead 
//		  7. Enter CompanyName Field Using id Locator
//		  8. Enter FirstName Field Using id Locator
//		  9. Enter LastName Field Using id Locator
//		  10. Enter FirstName(Local) Field Using id Locator
//		  11. Enter Department Field Using any Locator of Your Choice
//		  12. Enter Description Field Using any Locator of your choice 
//		  13. Enter your email in the E-mail address Field using the locator of your choice
//		  14. Select State/Province as NewYork Using Visible Text
//		  15. Click on Create Button
//                  16. Click on edit button
//                  17. Clear the Description Field using .clear()
//		  18. Fill ImportantNote Field with Any text
//		  19. Click on update button 
//		  20. Get the Title of Resulting Page. refer the video  using driver.getTitle()
//

package seliniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2day1Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setup Chrome Driver
		WebDriverManager.chromedriver().setup();

		//open the browser
		ChromeDriver driver= new ChromeDriver();

		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Maximime the window screen

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf002");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Leaf001");
		driver.findElement(By.className("inputBox")).sendKeys("Department");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf001@gmail.com");

		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select elem = new Select(ele);
		elem.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();
	
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("importantNote");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The Title is= " +driver.getTitle());
		driver.close();


	}

}
