package features;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Verify_Status_of_Posted_Purchase_Order extends BaseInit {

	@Test(priority = 18)
	public void statusofpostedorder() throws InterruptedException {

		// isElementPresent("msg_StatusPosted_xpath");
		// Thread.sleep(1000);
		GeneralMethod.waitForElementToBeVisible(driver, By.xpath(prop.getProperty("msg_VerifyProcess_xpath")), 400);
	}
}
