package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Actions_on_Order extends BaseInit {

	@Test(priority = 19)
	public void actionsonorder() throws InterruptedException {

		// isElementPresent("btn_Actionsbutton_xpath").click();
		// Thread.sleep(1000);
		WebElement elementaction = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_Actionsbutton_xpath")), 400);
		elementaction.click();

		// isElementPresent("btn_ShipOrderbutton_xpath").click();
		WebElement elementshiporder = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_ShipOrderbutton_xpath")), 10);
		elementshiporder.click();

		driver.switchTo().alert().accept();

	}
	
}
