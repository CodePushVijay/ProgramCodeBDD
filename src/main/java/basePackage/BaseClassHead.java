package basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassHead {

	public static WebDriver driver = null;

	public static void launchBrowserUrl() throws FileNotFoundException {
		
		//To Config the properties file
		File file = new File(
				"C:\\Users\\svija\\eclipse-workspace\\CucumberBDDFramework\\src\\test\\resources\\config\\config.properties");

		FileInputStream config = new FileInputStream(file);

		Properties pro = new Properties();
		try {
			pro.load(config);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Intialize the browser device
		String allBrowser = pro.getProperty("Browser");

		switch (allBrowser) {

		case "Chrome":
			WebDriverManager.chromedriver().setup();

			ChromeOptions opt = new ChromeOptions();
			ChromeOptions optChrome = opt.addArguments("--head");
				

			driver = new ChromeDriver(optChrome);

			driver.navigate().to(pro.getProperty("Onlineurl"));
			driver.manage().window().maximize();
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			
			EdgeOptions edge=new EdgeOptions();
			
			

			//driver = new EdgeDriver(optEdge);

			driver.navigate().to(pro.getProperty("HospUrl"));
			driver.manage().window().maximize();
			break;

		case "Firefox":
			WebDriverManager.firefoxdriver().setup();

			FirefoxOptions firefox = new FirefoxOptions();
			FirefoxOptions optFireFox = firefox.addArguments("--head");

			driver = new FirefoxDriver(optFireFox);

			driver.navigate().to(pro.getProperty("HospUrl"));
			driver.manage().window().maximize();
			break;

		default:

			System.out.println("Browser is not launch due to program mismatch");

			/*
			 * if(pro.getProperty("Browser").equalsIgnoreCase("Chrome")) {
			 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
			 * driver.navigate().to(pro.getProperty("Myurl"));
			 * driver.manage().window().maximize();
			 */
		}

	}
}
