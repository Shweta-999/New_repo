package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Build_Audience extends BaseInit {

	@Test(priority = 13)
	public void buildaudience() throws InterruptedException {

		// isElementPresent("btn_BuildAudiencebuttons_xpath").click();
		// Thread.sleep(1000);
		WebElement elementlevelaccordion = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_BuildAudiencebuttons_xpath")), 10);
		elementlevelaccordion.click();

		// isElementPresent("msg_VerifyProcess_xpath");
		// Thread.sleep(1000);
		GeneralMethod.waitForElementToBeVisible(driver, By.xpath(prop.getProperty("msg_VerifyProcess_xpath")), 10);

		// isElementPresent("msg_AudienceBuilt_xpath");
		GeneralMethod.waitForElementToBeVisible(driver, By.xpath(prop.getProperty("msg_AudienceBuilt_xpath")), 10);

	}
}
