package features;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Verify_Level_Created extends BaseInit {

	@Test(priority = 6)
	public void verifylevelcreated() throws IOException {

		// isElementPresent("lkn_LevelAccordion_xpath").click();
		WebElement elementlevelaccordion = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("lkn_LevelAccordion_xpath")), 10);
		elementlevelaccordion.click();

	}
}
