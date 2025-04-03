package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Edit_Level extends BaseInit {

	@Test(priority = 7)
	public void editlevel() throws InterruptedException {

		// isElementPresent("btn_EditLevel_xpath").click();
		// Thread.sleep(2000);
		WebElement elementeditlevel = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_EditLevel_xpath")), 10);
		elementeditlevel.click();

		// isElementPresent("ip_LevelName_xpath").sendKeys("2");
		WebElement visibleElementlevelname = GeneralMethod.waitForElementToBeVisible(driver,
				By.xpath(prop.getProperty("ip_LevelName_xpath")), 10);
		visibleElementlevelname.sendKeys("2");

		// isElementPresent("btn_Submitbutton_xpath").click();
		// Thread.sleep(2000);
		WebElement elementsubmit = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_Submitbutton_xpath")), 10);
		elementsubmit.click();
	}
}
