package features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;

public class Verify_Placed_Order extends BaseInit {

	@Test(priority = 16)
	public void verifyplacedorder() throws InterruptedException {

		WebDriverWait POdwait = new WebDriverWait(driver, Duration.ofHours(10));
		POdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class=\"main-header-title\"]")));
		// Thread.sleep(5000);

	}
}
