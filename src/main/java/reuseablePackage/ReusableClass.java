package reuseablePackage;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import basePackage.BaseDesiredCapsClass;


//import basePackage.BaseClassHead;


//import basePackage.BaseClass;


public class ReusableClass extends BaseDesiredCapsClass {
	
//Click the element
public static void btn_Click(WebElement element) {
		
		element.click();
		
	}

//Enter the element
public static void enter_Text(WebElement element, String value) {
		
		element.sendKeys(value);
		
	}

//get the text from element
public static void get_Textpage(WebElement element, String outputtext) {
	
	Assert.assertEquals(element.getText(), outputtext);
	System.out.println(element.getText());
	
	
}
//get the title from element
public static void get_TitleOfPage() {

	System.out.println(driver.getTitle());
		
}

//wait for implict
public static void waitForImplict() {
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}


//wait for sudden duration
public static void waitDuration() {
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

//Close the single browser
public static void close_Browser() {
	
	driver.close();
	
}

//Quit the all browser at same time
public static void quit_AllBrowser() {
	
	driver.quit();
	
}

//Handle the Window based application
public static void window_BasedHandle(WebDriver element) {
	
	Set<String> windowHandles = driver.getWindowHandles();
	driver.switchTo().window("windowHandles");
	
}

//Select the Drop down list
public static void select_DropDown(WebElement element, String list) {
	
	Select sl=new Select(element);
	sl.selectByVisibleText(list);
}

//Action the mouse over
public static void action_RightClick() {
	
	Actions action = new Actions(driver);
	action.contextClick().build().perform();
}

public static void action_ClickAndHold() {
	
	Actions action = new Actions(driver);
	action.clickAndHold().build().perform();
}

public static void action_DoubleClick() {
	
	Actions action = new Actions(driver);
	action.doubleClick().build().perform();
}

public static void action_DragAndDrop(WebElement source, WebElement target) {
	
	Actions action = new Actions(driver);
	action.dragAndDrop(source, target).build().perform();
}

//Setup takeScreenshot

public static void take_Screenshot() throws IOException {
	
	 //Use TakesScreenshot method to capture screenshot
	TakesScreenshot snap= (TakesScreenshot)driver;
	
	//Saving the screenshot in desired location
	File source  = snap.getScreenshotAs(OutputType.FILE);
	
	 //Path to the location to save screenshot
	FileUtils.copyFile(source, new File("C:\\Users\\svija\\eclipse-workspace\\CucumberBDDFramework\\screenshots\\screen.png"));
	
	
}



 
}


 