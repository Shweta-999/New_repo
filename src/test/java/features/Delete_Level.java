package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Delete_Level extends BaseInit {

	@Test(priority = 11)
	public void deletelevel() throws InterruptedException {

		// isElementPresent("btn_CopiedLevel_xpath").click();
		// Thread.sleep(2000);
		WebElement elementcopiedlevel = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_CopiedLevel_xpath")), 10);
		elementcopiedlevel.click();

		// isElementPresent("btn_DeleteLevel_xpath").click();
		// Thread.sleep(2000);
		WebElement elementdeletelevel = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_DeleteLevel_xpath")), 10);
		elementdeletelevel.click();

		// isElementPresent("btn_Submitbutton1_xpath").click();
		WebElement elementsubmit = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_Submitbutton1_xpath")), 10);
		elementsubmit.click();

	}
}
