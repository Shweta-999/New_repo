package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Credit_Criteria_Selection extends BaseInit {

	@Test(priority = 4)
	public void creditcriteriaselection() throws InterruptedException {

		// isElementPresent("ip_Ficomin_xpath").sendKeys("800");
		// Thread.sleep(2000);
		WebElement visibleElementficomin = GeneralMethod.waitForElementToBeVisible(driver,
				By.xpath(prop.getProperty("ip_Ficomin_xpath")), 10);
		visibleElementficomin.sendKeys("800");

		// isElementPresent("ip_Ficomax_xpath").sendKeys("850");
		WebElement visibleElementficomax = GeneralMethod.waitForElementToBeVisible(driver,
				By.xpath(prop.getProperty("ip_Ficomax_xpath")), 10);
		visibleElementficomax.sendKeys("850");

		// isElementPresent("btn_Submitbutton_xpath").click();
		// Thread.sleep(2000);
		WebElement elementsubmit = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_Submitbutton_xpath")), 10);
		elementsubmit.click();

	}
}
