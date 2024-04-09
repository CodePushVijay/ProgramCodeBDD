package reuseablePackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import basePackage.BaseClassHead;

public class AdvanceReuseable extends BaseClassHead {

	public static void toClickBtn(WebElement element) {

		element.click();
	}

	public static void toEnterKey(WebElement element, String value) {

		element.sendKeys(value);
		
			
		}
	
	public static void windowHandles() {
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String s:windowHandles) {
			
			driver.switchTo().window(s);
		}
	}
		
		
		public static void mutliWindowHandles(int indexvalue) {
			
			Set<String> mutliWindowHandles = driver.getWindowHandles();
			
			for(String str:mutliWindowHandles) {
				
				driver.switchTo().window(str);
				
				List<String> wind= new ArrayList<String>();
				//boolean all = wind.addAll(windowHandles);
		         wind.addAll(mutliWindowHandles);
		         
		         
		         driver.switchTo().window(wind.get(indexvalue));
			}
		
	}
	
	public static void takeScreenshot(String filePath) throws IOException {
		
		TakesScreenshot screen=(TakesScreenshot)driver;
			
		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotAs, new File(filePath));
		
	}
	
	public static void getTextOutput(WebElement element) {
		
		//Assert.assertEquals(element.getText(), value);
		String output = element.getText();
		System.out.println(output);
	}
	
	public static void waitDuration() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getAttribute(WebElement element, String atrvalue) {
		
		String attribute = element.getAttribute(atrvalue);
		System.out.println(attribute);
		
		
	}
	
	public static void getTitle() {
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		
	}
	
	 
	

	

}
