/**
 * 
 */
/**
 * @author waqar.tufail
 *
 */
package Utils;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
	protected static WebDriver driver;
	
	

	public DriverFactory()   {
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public static void quitDriver() {
		driver.quit();
		driver = null;
	}
}