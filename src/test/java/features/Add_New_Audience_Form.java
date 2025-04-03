package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Add_New_Audience_Form extends BaseInit {

	@Test(priority = 2)
	public void audienceform() throws InterruptedException {

		// isElementPresent("ip_Name_xpath").sendKeys(GeneralMethod.audienceName);
		WebElement visibleElementname = GeneralMethod.waitForElementToBeVisible(driver,
				By.xpath(prop.getProperty("ip_Name_xpath")), 10);
		visibleElementname.sendKeys(GeneralMethod.audienceName);

		// GeneralMethod.setImplicitWait(driver, 2);
		// isElementPresent("lnk_UsageType_xpath").click();
		WebElement elementusage = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("lnk_UsageType_xpath")), 10);
		elementusage.click();
		driver.getPageSource().contains("Mail Piece for Direct Mail: Compliant.");

		// GeneralMethod.setImplicitWait(driver, 2);
		// isElementPresent("btn_Savebutton_xpath").click();
		// GeneralMethod.setImplicitWait(driver, 2);
		WebElement elementsave = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_Savebutton_xpath")), 10);
		elementsave.click();

	}
}
