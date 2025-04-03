package features;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;

public class Verify_copied_Level extends BaseInit {

  @Test(priority = 10)
  public void verifycopiedlevel() {
	  
		driver.getPageSource().contains("copy");

  }
}
