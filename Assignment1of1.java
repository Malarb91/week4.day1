package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.poifs.property.Parent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1of1 {

	public static void main(String[] args) throws InterruptedException {
//		///*
//		 * //Pseudo Code
//		 * 
//		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
//		 * 
//		 * 2. Enter UserName and Password Using Id Locator
//		 * 
//		 * 3. Click on Login Button using Class Locator
//		 * 
//		 * 4. Click on CRM/SFA Link
//		 * 
//		 * 5. Click on contacts Button
//		 * 	
//		 * 6. Click on Merge Contacts using Xpath Locator
//		 * 
//		 * 7. Click on Widget of From Contact
//		 * 
//		 * 8. Click on First Resulting Contact
//		 * 
//		 * 9. Click on Widget of To Contact
//		 * 
//		 * 10. Click on Second Resulting Contact
//		 * 
//		 * 11. Click on Merge button using Xpath Locator
//		 * 
//		 * 12. Accept the Alert
//		 * 
//		 * 13. Verify the title of the page
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();;
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(winList.get(1));
		Thread.sleep(3000);
		
		WebElement contactId1 = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		String text1 = contactId1.getText();
		System.out.println(text1);
		contactId1.click();
		driver.switchTo().window(winList.get(0));
		
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Set<String> windowHandles0 = driver.getWindowHandles();
		List<String> winList1 = new ArrayList<String>(windowHandles0);
		driver.switchTo().window(winList1.get(1));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
		driver.switchTo().window(winList.get(0));
		driver.findElement(By.linkText("Merge")).click();
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
//		 */
	}


	}


