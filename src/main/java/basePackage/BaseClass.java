package basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	

	//Instant Variable
	public static WebDriver driver=null;
	
	public static File config;
	
	public static FileInputStream path;
	
	public static Properties pro;
	
	public static void setupConfigForLaunchBrowser() throws IOException {
		
		config=new File("C:\\Users\\svija\\eclipse-workspace\\CucumberBDDFramework\\src\\test\\resources\\config\\config.properties");
		
	    path=new FileInputStream(config);

		Properties pro=new Properties();
		pro.load(path);
		
		if(pro.getProperty("Browser").equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.navigate().to(pro.getProperty("Myurl"));
			driver.manage().window().maximize();	
		}
		else if(pro.getProperty("Browser").equalsIgnoreCase("Edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.navigate().to(pro.getProperty("Myurl"));
			driver.manage().window().maximize();
		}
		else if(pro.getProperty("Browser").equalsIgnoreCase("Firefox")) {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.navigate().to(pro.getProperty("Myurl"));
			driver.manage().window().maximize();
		}
		
	}

	public static void  contactAppLogin(String Username, String Password) throws IOException {
		
		config=new File("C:\\Users\\svija\\eclipse-workspace\\CucumberBDDFramework\\src\\test\\resources\\config\\config.properties");
		
	    path=new FileInputStream(config);

		Properties pro=new Properties();
		pro.load(path);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(pro.getProperty(Username));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pro.getProperty(Password));
		
		
		
		
		
		
	}
}
