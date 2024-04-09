package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseDesiredCapsClass {

	public static WebDriver driver = null;

	public static void baseToLaunchURL() throws FileNotFoundException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\svija\\eclipse-workspace\\CucumberBDDFramework\\src\\test\\resources\\config\\config.properties");

		Properties pro = new Properties();
		try {
			pro.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String browserLaunch = pro.getProperty("Browser");

		switch (browserLaunch) {

		case "Chrome":

			DesiredCapabilities caps = new DesiredCapabilities();

			// caps.setAcceptInsecureCerts(false);
			caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, false);
			// caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");

			ChromeOptions option = new ChromeOptions();
			caps.merge(option);
			option.addArguments("--head");
			option.addArguments("--start-maximized");
			option.addArguments("--disable-popup-blocking");

			driver = new ChromeDriver(option);

			driver.navigate().to(pro.getProperty("Myurl"));
			break;

		}
	}

}
