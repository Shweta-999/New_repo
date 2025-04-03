package features;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Verify_Status_of_Posted_Shipped_Order extends BaseInit {

	@Test(priority = 20)
	public void verifystatusofshipped() throws InterruptedException {
		// isElementPresent("msg_OrderStatus_xpath");
		// Thread.sleep(1000);
		GeneralMethod.waitForElementToBeVisible(driver, By.xpath(prop.getProperty("msg_OrderStatus_xpath")), 10);

		// isElementPresent("cnt_OrderCount_xpath");
		// Thread.sleep(1000);
		GeneralMethod.waitForElementToBeVisible(driver, By.xpath(prop.getProperty("cnt_OrderCount_xpath")), 10);

	}
}
