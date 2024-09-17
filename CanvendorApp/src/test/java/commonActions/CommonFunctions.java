package commonActions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	public static Properties properties;
	public static WebDriver driver; 

	public void loadPropertyfile() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileInputStream);
	}

	@BeforeSuite
	public void launchBrowser() throws IOException {
		loadPropertyfile();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("fireFox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

//	@AfterSuite
//	public void closeBrowser() {
//		if (driver != null) {
//			driver.quit();
		}
	//}
//}
