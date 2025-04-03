package features;
import org.testng.annotations.Test;

import Prerequisite.BaseInit;

public class Verify_updated_Level extends BaseInit {
	
  @Test (priority = 8)
  public void verifyupdatelevel1() {
	  
		driver.getPageSource().contains("Level12");

  }
 
}
