package features;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Create_Level extends BaseInit {

	@Test(priority = 5)
	public void createlevel() throws InterruptedException, IOException {
		// isElementPresent("ip_LevelName_xpath").sendKeys(GeneralMethod.level);
		WebElement visibleElementlevelname = GeneralMethod.waitForElementToBeVisible(driver,
				By.xpath(prop.getProperty("ip_LevelName_xpath")), 10);
		visibleElementlevelname.sendKeys(GeneralMethod.level);

		// isElementPresent("lnk_LevelCriteria_xpath").click();
		// Thread.sleep(2000);
		WebElement elementlevelcriteria = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("lnk_LevelCriteria_xpath")), 10);
		elementlevelcriteria.click();

		// isElementPresent("ip_Ficomin_xpath").sendKeys("600");
		// Thread.sleep(2000);
		WebElement visibleElementficomin2 = GeneralMethod.waitForElementToBeVisible(driver,
				By.xpath(prop.getProperty("ip_Ficomin_xpath")), 10);
		visibleElementficomin2.sendKeys("600");

		// isElementPresent("ip_Ficomax_xpath").sendKeys("650");
		WebElement visibleElementficomax2 = GeneralMethod.waitForElementToBeVisible(driver,
				By.xpath(prop.getProperty("ip_Ficomax_xpath")), 10);
		visibleElementficomax2.sendKeys("650");

		// isElementPresent("btn_Submitbutton_xpath").click();
		// Thread.sleep(2000);
		WebElement elementsubmit = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_Submitbutton_xpath")), 10);
		elementsubmit.click();

	}
}
