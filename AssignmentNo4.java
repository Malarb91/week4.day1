package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentNo4 {

	public static void main(String[] args) throws IOException {
//		Assignment 4:
//			------------
//			http://leafground.com/pages/frame.html
//			1.Take the the screenshot of the click me button of first frame
//			2.Find the number of frames
//			  - find the Elements by tagname - iframe
//			  - Store it in a list
//			  - Get the size of the list. (This gives the count of the frames visible to the main page)
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
	//driver.findElement(By.xpath("//button[@id='Click']"));
	File source=driver.getScreenshotAs(OutputType.FILE);
	File target=new File("./snaps/img.png");
	FileUtils.copyFile(source, target);
	
	
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		for (WebElement findIFrame : findElements) {
			
			String string = findIFrame.getText();
			System.out.println(string);
			int size = findElements.size();
			System.out.println(size);
			
		}
		
	}

}
