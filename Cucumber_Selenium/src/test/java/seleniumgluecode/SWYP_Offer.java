package seleniumgluecode;

import jxl.Sheet;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SWYP_Offer extends Utils.UtilMethods {
	public static WebDriver Driver = LoginSteps.Driver;
	String sheetname = "DealType";
	String offersheetname = "Offers";

	@Given("^user select the SWYP option$")
	public void user_select_the_SWYP_option() throws Throwable {

		Sheet DealType = getsheet(sheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 1) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("SWYP-true")) {
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

	@When("^Click on Next$")
	public void click_on_Next() throws Throwable {
		Sheet DealType = getsheet(sheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 1) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("SWYP-true")) {
						clickbyxpath(Driver, sheetname, i, 4);
						wait3Seconds();
					}
				}
			}
		}
	}

	@Then("^user will see the SWYP Offer$")
	public void user_will_see_the_SWYP_Offer() throws Throwable {
		Sheet DealType = getsheet(sheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 1) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("SWYP-true")) {
						String exp_message = "SWYP";
						String actual = getElementValueByXpath(Driver,
								sheetname, i, 5);
						Assert.assertEquals(exp_message, actual);
						wait3Seconds();
					}
				}
			}
		}
	}

	@Then("^Click on flip to see offer Details$")
	public void click_on_flip_to_see_offer_Details() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 1) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("SWYP-true")) {
						clickbyxpath(Driver, offersheetname, i, 2);
						wait3Seconds();
					}
				}
			}
		}
	}

	@Then("^User will see the Offer Details$")
	public void user_will_see_the_Offer_Details() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 1) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("SWYP-true")) {
						String exp_message = "Swyp membership for AED 50 valid for 30 days";
						String actual = getElementValueByXpath(Driver,
								offersheetname, i, 3);
						Assert.assertEquals(exp_message, actual);
					}
				}
			}
		}
	}

	@When("^Click on flip back$")
	public void click_on_flip_back() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 1) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("SWYP-true")) {
						clickbyxpath(Driver, offersheetname, i, 4);
						wait3Seconds();
					}
				}
			}
		}
	}

	@When("^Select the offer$")
	public void Select_the_offer() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 1) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("SWYP-true")) {
						clickbyxpath(Driver, offersheetname, i, 5);
						wait3Seconds();
						clickbyxpath(Driver, offersheetname, i, 6);
						clickbyxpath(Driver, offersheetname, i, 7);
						clickbyxpath(Driver, offersheetname, i, 8);
						wait3Seconds();
					}
				}
			}
		}
	}

	@When("^Enter the information to Notify$")
	public void enter_the_information_to_Notify() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 1) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("SWYP-true")) {
						sendkeysbyid(Driver, offersheetname, i, 9,
								getCelldata(offersheetname, i, 10));
						clickbyxpath(Driver, offersheetname, i, 11);
						wait10Seconds();
					}
				}
			}
		}
	}

	@Then("^User will see the Reference Number$")
	public void user_will_see_the_Reference_Number() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 1) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("SWYP-true")) {
						String expected_email = getCelldata(offersheetname, i,
								10);
						String actual_email = getElementValueByXpath(Driver,
								"Offers", i, 12);
						System.out.print("Reference No is: "
								+ getElementValueByXpath(Driver,
										offersheetname, i, 13));
						Assert.assertEquals(expected_email, actual_email);
						clickbyxpath(Driver, offersheetname, i, 14);
						wait5Seconds();
						clickbyxpath(Driver, sheetname, i, 2);
					}
				}
			}
		}
	}
}
