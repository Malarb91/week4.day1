package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erails {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		
		driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		
		Actions builder = new Actions(driver);
		
		WebElement from = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		builder.moveToElement(from).click();
		from.sendKeys("MS");
		Thread.sleep(2000);
		
		
		WebElement to = driver.findElement(By.xpath("//input[@id=\"txtStationTo\"]"));
		builder.moveToElement(to).click();
		to.sendKeys("mdu");
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("//input[@id=\"chkSelectDateOnly\"]"));
		builder.moveToElement(date).click();
		
		List<WebElement> result = driver.findElements(By.xpath("//a[text()=\"Train Name\"]"));
		for (WebElement answers : result) {
			String text = answers.getText();
			System.out.println(text);
		}
		
//		WebElement getTrains = driver.findElement(By.xpath("//input[@value=\"Get Trains\"]"));
//		builder.moveToElement(getTrains).click();
//		String NoDuplicates = new ArrayList(getTrains);
		
		
		
		
		
		
		
		

	}

}
