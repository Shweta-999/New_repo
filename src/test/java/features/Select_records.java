package features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Select_records extends BaseInit {

	@Test(priority = 14)
	public void selectrecords() throws InterruptedException {
		// Thread.sleep(30000);
		// isElementPresent("lnk_SelectRecords2_xpath").click();
		WebElement elementlselectrecord = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("lnk_SelectRecords2_xpath")), 50);
		elementlselectrecord.click();

		// isElementPresent("ip_RequestedInput_xpath").clear();
		// Thread.sleep(1000);
		WebElement elementlrequestedip = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("ip_RequestedInput_xpath")), 10);
		elementlrequestedip.clear();

		// isElementPresent("ip_RequestedInput_xpath").sendKeys("10");
		WebElement visibleElementinput = GeneralMethod.waitForElementToBeVisible(driver,
				By.xpath(prop.getProperty("ip_RequestedInput_xpath")), 10);
		visibleElementinput.sendKeys("10");

		// isElementPresent("btn_Savebutton1_xpath").click();
		WebElement elementlsave = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_Savebutton1_xpath")), 10);
		elementlsave.click();
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofHours(10));
		webdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/label[contains(.,'No')]")));

		// Thread.sleep(1000);

	}
}
