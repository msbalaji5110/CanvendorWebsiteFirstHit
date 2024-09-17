package testCases;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import commonActions.CommonFunctions;
import pageObject.About_Page_Page_Objects;
import pageObject.Careers_Page_Page_Objects;
import pageObject.Contact_Page_Page_Objects;
import pageObject.Home_Page_Page_Objects;
import pageObject.Industries_Page_Page_Objects;
import pageObject.Services_Page_Page_Objects;


public class Click_Top__Navigation_Button extends CommonFunctions {
	@Test
	public void clickTopBtn()  {
		PageFactory.initElements(driver,About_Page_Page_Objects.class);
		About_Page_Page_Objects.aboutPageObjects.click();
	
		
		PageFactory.initElements(driver,Home_Page_Page_Objects.class);
		Home_Page_Page_Objects.homePageObjects.click();
		
		PageFactory.initElements(driver,Services_Page_Page_Objects.class);
		Services_Page_Page_Objects.servicesPageObjects.click();
		
		PageFactory.initElements(driver,Industries_Page_Page_Objects.class);
		Industries_Page_Page_Objects.industriesPageObjects.click();
		
		PageFactory.initElements(driver,Contact_Page_Page_Objects.class);
		Contact_Page_Page_Objects.contactPageObjects.click();
		
		PageFactory.initElements(driver,Careers_Page_Page_Objects.class);
		Careers_Page_Page_Objects.careersPageObjects.click();
		
	}
	
}
