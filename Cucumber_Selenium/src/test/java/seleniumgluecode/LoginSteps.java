package seleniumgluecode;

import jxl.Sheet;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends Utils.UtilMethods {

	public static WebDriver Driver;

	@Given("^user is  on \"([^\"]*)\"$")
	public void user_is_on_homepage(String homepage) throws Throwable {

		Sheet DriverSheet = getsheet("Browsers");

		if (DriverSheet.getRows() > 0) {
			for (int i = 0; i < DriverSheet.getRows(); i++) {
				if (i == 0) {
					String browser = getCelldata("Browsers", i, 0) + "-"
							+ getCelldata("Browsers", i, 1);
					if (browser.equals("Firefox-true")) {
						String gecko = getCelldata("Browsers", i, 2);
						System.setProperty("webdriver.gecko.driver", gecko);
						Driver = new FirefoxDriver();
						Driver.manage().window().maximize();
					}
				}
				if (i == 1) {
					String browser = getCelldata("Browsers", i, 0)
					// DriverSheet.getCell(0, i).getContents()
							+ "-" + getCelldata("Browsers", i, 1);
					if (browser.equals("Chrome-true")) {
						String chrome = getCelldata("Browsers", i, 2);
						System.setProperty("webdriver.chrome.driver", chrome);
						Driver = new ChromeDriver();
						Driver.manage().window().maximize();
					}
				}
			}
		}
		Driver.get(homepage);
		wait5Seconds();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_Password(String username,
			String password) throws Throwable {

		Sheet HomePage = getsheet("HomePage");
		if (HomePage.getRows() > 0) {
			for (int i = 0; i < HomePage.getRows(); i++) {
				if (i == 0) {
					sendkeysbyid(Driver, "HomePage", i, 1, username);
				}
				if (i == 1) {
					Driver.findElement(
							By.id(HomePage.getCell(1, i).getContents()))
							.sendKeys(password);
					sendkeysbyid(Driver, "HomePage", i, 1, password);
				}
				if (i == 2) {
					clickbyxpath(Driver, "HomePage", i, 1);
					wait3Seconds();
				}
			}
		}
	}

	@Then("^Success message is displayed$")
	public void Success_message_is_displayed() throws Throwable {
		Sheet HomePage = getsheet("HomePage");
		if (HomePage.getRows() > 0) {
			for (int i = 0; i < HomePage.getRows(); i++) {
				if (i == 3) {
					String exp_message = "What type of deal are you looking for today?";
					String actual = getElementValueByXpath(Driver, "HomePage",
							i, 1);
					Assert.assertEquals(exp_message, actual);
					wait3Seconds();
				}
			}
		}
	}

}
