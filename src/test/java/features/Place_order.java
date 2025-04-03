package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Place_order extends BaseInit {

	@Test(priority = 15)
	public void placeorder() throws InterruptedException {

		// isElementPresent("lnk_SelectFile_xpath").click();
		// Thread.sleep(1000);
		WebElement elementselectfile = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("lnk_SelectFile_xpath")), 10);
		elementselectfile.click();

		// isElementPresent("ip_PONumber_xpath").sendKeys(GeneralMethod.poNumber);
		WebElement visibleElementinput = GeneralMethod.waitForElementToBeVisible(driver,
				By.xpath(prop.getProperty("ip_PONumber_xpath")), 10);
		visibleElementinput.sendKeys(GeneralMethod.poNumber);

		// isElementPresent("btn_PlaceOrder_xpath").click();
		WebElement elementplaceorder = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_PlaceOrder_xpath")), 10);
		elementplaceorder.click();

		// isElementPresent("msg_VerifyProcess_xpath");
		// Thread.sleep(1000);
		GeneralMethod.waitForElementToBeVisible(driver, By.xpath(prop.getProperty("msg_VerifyProcess_xpath")), 10);

		// isElementPresent("msg_VerifyProcess2_xpath");
		// Thread.sleep(20000);
		GeneralMethod.waitForElementToBeVisible(driver, By.xpath(prop.getProperty("msg_VerifyProcess2_xpath")), 10);

	}
}
