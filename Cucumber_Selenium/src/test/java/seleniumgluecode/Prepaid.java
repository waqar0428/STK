package seleniumgluecode;

import jxl.Sheet;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Prepaid extends Utils.UtilMethods {
	public static WebDriver Driver = eLife_Premium_Offer.Driver;
	String sheetname = "DealType";

	@Given("^user select the Prepaid$")
	public void user_select_the_Prepaid() throws Throwable {
		Sheet DealType = getsheet(sheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 4) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("Prepaid-true")) {
						System.out.print("Executing Scenario is: "
								+ getCelldata("DealType", i, 0));
						clickbyxpath(Driver, sheetname, i, 2);
						clickbyxpath(Driver, sheetname, i, 3);
						wait3Seconds();
					}
				}
			}
		}
	}

	@When("^Click on Next for Prepaid option$")
	public void click_on_Next_for_Prepaid_option() throws Throwable {
		Sheet DealType = getsheet(sheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 4) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("Prepaid-true")) {
						clickbyxpath(Driver, sheetname, i, 4);
						wait3Seconds();
					}
				}
			}
		}
	}

	@Then("^user will see the Prepaid Page$")
	public void user_will_see_the_Prepaid_Page() throws Throwable {
		Sheet DealType = getsheet(sheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 2) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("Prepaid-true")) {
						String exp_message = getCelldata(sheetname, i, 6);
						String actual = getElementValueByXpath(Driver,
								sheetname, i, 5);
						Assert.assertEquals(exp_message, actual);
						wait3Seconds();
					}
				}
			}
		}
	}
}
