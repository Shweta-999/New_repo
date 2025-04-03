package features;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Verifying_deleted_element extends BaseInit {
	
  @Test(priority = 12)
  public void verifyingdeletedelement() {
	  
	  	  
	 // isElementPresent("vfy_DeletedLevel_xpath");
		GeneralMethod.waitForElementToBeVisible(driver, By.xpath(prop.getProperty("vfy_DeletedLevel_xpath")), 10);
  }
}
