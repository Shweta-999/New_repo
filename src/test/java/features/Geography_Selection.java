package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Geography_Selection extends BaseInit {

	@Test(priority = 3)
	public void geographyselection() throws InterruptedException {

		// isElementPresent("opt_State_xpath").click();
		WebElement elementstate = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("opt_State_xpath")), 10);
		elementstate.click();

		// isElementPresent("lnk_GlobalRejects_xpath").click();
		WebElement elementglobalreject = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("lnk_GlobalRejects_xpath")), 10);
		elementglobalreject.click();

		// Thread.sleep(2000);
	}
}
