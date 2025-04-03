package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Copy_Level extends BaseInit {

	@Test(priority = 9)
	public void copylevel() throws InterruptedException {

		// isElementPresent("btn_CopyLevel_xpath").click();
		// Thread.sleep(2000);
		WebElement elementcopy = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_CopyLevel_xpath")), 10);
		elementcopy.click();

		// isElementPresent("btn_Submitbutton_xpath").click();
		// Thread.sleep(2000);
		WebElement elementsubmit = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_Submitbutton_xpath")), 10);
		elementsubmit.click();
	}
}
