package features;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Prerequisite.BaseInit;
import Utility.GeneralMethod;

public class Add_New_Audience_page_navigation extends BaseInit {

	@Test
	public void addnewpagenavigation() throws IOException {

		startUP();

	}

	@Test(priority = 1)
	public void addnewaudience() throws IOException, InterruptedException {
		// GeneralMethod.setImplicitWait(driver, 2);
		// isElementPresent("ip_username_id").sendKeys("Sbhujbal");
		WebElement visibleElementu = GeneralMethod.waitForElementToBeVisible(driver,
				By.id(prop.getProperty("ip_username_id")), 10);
		visibleElementu.sendKeys(prop.getProperty("username_data"));

		// isElementPresent("ip_password_id").sendKeys("Test@123");
		// GeneralMethod.setImplicitWait(driver, 2);
		WebElement visibleElementp = GeneralMethod.waitForElementToBeVisible(driver,
				By.id(prop.getProperty("ip_password_id")), 10);
		visibleElementp.sendKeys(prop.getProperty("password_data"));

		// isElementPresent("btn_SignInbutton_xpath").click();
		WebElement elementsignin = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_SignInbutton_xpath")), 10);
		elementsignin.click();

		// GeneralMethod.setImplicitWait(driver, 2);
		// isElementPresent("btn_Createaudiencebutton_xpath").click();
		WebElement elementcreateaud = GeneralMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_Createaudiencebutton_xpath")), 10);
		elementcreateaud.click();

	}

}
