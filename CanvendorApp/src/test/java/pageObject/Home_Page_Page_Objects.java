package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page_Page_Objects {
	@FindBy(xpath = "//a[text()='Home']")
	 public static WebElement homePageObjects;
	}

