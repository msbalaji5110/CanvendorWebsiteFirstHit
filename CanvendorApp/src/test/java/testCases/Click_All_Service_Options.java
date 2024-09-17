package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonActions.CommonFunctions;
import pageObject.Services_Page_Page_Objects;


public class Click_All_Service_Options extends CommonFunctions {
	@Test
	public void serviceOptions() throws InterruptedException {
		PageFactory.initElements(driver,Services_Page_Page_Objects.class);
		Services_Page_Page_Objects.servicesPageObjects.click();
		
		PageFactory.initElements(driver,Services_Page_Page_Objects.class);
		Services_Page_Page_Objects.clickAimlSolutions.click();
		Thread.sleep(2000);

		Services_Page_Page_Objects.servicesPageObjects.click();

		PageFactory.initElements(driver,Services_Page_Page_Objects.class);
		Services_Page_Page_Objects.clickCloudSolutions.click();
		Thread.sleep(2000);

		Services_Page_Page_Objects.servicesPageObjects.click();

		PageFactory.initElements(driver,Services_Page_Page_Objects.class);
		Services_Page_Page_Objects.clickDigitalService.click();
		Thread.sleep(2000);

		Services_Page_Page_Objects.servicesPageObjects.click();

		PageFactory.initElements(driver,Services_Page_Page_Objects.class);
		Services_Page_Page_Objects.clickItConsulting.click();
		Thread.sleep(2000);

		Services_Page_Page_Objects.servicesPageObjects.click();

		PageFactory.initElements(driver,Services_Page_Page_Objects.class);
		Services_Page_Page_Objects.clickEnterprisesSolUTIONS.click();
		Thread.sleep(2000);

		Services_Page_Page_Objects.servicesPageObjects.click();
		

		PageFactory.initElements(driver,Services_Page_Page_Objects.class);
		Services_Page_Page_Objects.clickWebAppDevelopment.click();







	}

}
