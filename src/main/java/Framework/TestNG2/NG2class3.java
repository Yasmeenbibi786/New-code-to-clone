package Framework.TestNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NG2class3 {
	@Test(groups="3rdgroup",priority=3)
	public void prioritym() {
		System.out.println("this is 3rd priority group to extecute at last.");
		
	}

}
