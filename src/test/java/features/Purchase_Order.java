package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Purchase_Order extends BaseInit {

	@Test(priority = 17)
	public void purchaseorder() throws InterruptedException {

		// isElementPresent("btn_Purchasebutton_xpath").click();
		WebElement elementpurchase = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_Purchasebutton_xpath")), 10);
		elementpurchase.click();

		// isElementPresent("msg_VerifyProcess_xpath");
		// Thread.sleep(1000);
		GeneralMethod.waitForElementToBeVisible(driver, By.xpath(prop.getProperty("msg_VerifyProcess_xpath")), 10);

		// isElementPresent("msg_VerifyProcess2_xpath");
		// Thread.sleep(1000);
		GeneralMethod.waitForElementToBeVisible(driver, By.xpath(prop.getProperty("msg_VerifyProcess2_xpath")), 10);
		// Thread.sleep(300000);
	}
}
