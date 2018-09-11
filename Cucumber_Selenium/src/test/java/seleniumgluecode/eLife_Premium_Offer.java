package seleniumgluecode;

import jxl.Sheet;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class eLife_Premium_Offer extends Utils.UtilMethods {
	public static WebDriver Driver = eLife_Family_Offer.Driver;
	String sheetname = "DealType";
	String offersheetname = "Offers";

	@Given("^user select the ELife Premium option$")
	public void user_select_the_ELife_Premium_option() throws Throwable {
		Sheet DealType = getsheet(sheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 3) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("eLife Premium-true")) {
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

	@When("^Click on Next for ELife Premium$")
	public void click_on_Next_for_ELife_Premium() throws Throwable {
		Sheet DealType = getsheet(sheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 3) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("eLife Premium-true")) {
						clickbyxpath(Driver, sheetname, i, 4);
						wait3Seconds();
					}
				}
			}
		}
	}

	@Then("^user will see the ELife Premium Offer$")
	public void user_will_see_the_ELife_Premium_Offer() throws Throwable {
		Sheet DealType = getsheet(sheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 3) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("eLife Premium-true")) {
						String exp_message = "ELIFE";
						String actual = getElementValueByXpath(Driver,
								sheetname, i, 5);
						Assert.assertEquals(exp_message, actual);
						wait3Seconds();
					}
				}
			}
		}
	}

	@Then("^Click on flip to see ELife Premium offer Details$")
	public void click_on_flip_to_see_ELife_Premium_offer_Details()
			throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 3) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("eLife Premium-true")) {
						clickbyxpath(Driver, offersheetname, i, 2);
						wait3Seconds();
					}
				}
			}
		}
	}

	@Then("^User will see the ELife Premium Offer Details$")
	public void user_will_see_the_ELife_Premium_Offer_Details()
			throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 3) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("eLife Premium-true")) {
						String exp_message = "100 Mbps Broadband Speed";
						String actual = getElementValueByXpath(Driver,
								offersheetname, i, 3);
						Assert.assertEquals(exp_message, actual);
						wait3Seconds();
					}
				}
			}
		}
	}

	@Then("^Click on ELife Premium flip back$")
	public void click_on_ELife_Premium_flip_back() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 3) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("eLife Premium-true")) {
						clickbyxpath(Driver, offersheetname, i, 4);
						wait3Seconds();
					}
				}
			}
		}
	}

	@Then("^Select the ELife Premium offer$")
	public void select_the_ELife_Premium_offer() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 3) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("eLife Premium-true")) {
						clickbyxpath(Driver, offersheetname, i, 5);
						wait3Seconds();
						clickbyxpath(Driver, offersheetname, i, 6);
						clickbyxpath(Driver, offersheetname, i, 7);
						wait3Seconds();
					}
				}
			}
		}
	}

	@Then("^Enter the information to Notify ELife Premium Offer$")
	public void enter_the_information_to_Notify_ELife_Premium_Offer()
			throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 3) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("eLife Premium-true")) {
						sendkeysbyid(Driver, offersheetname, i, 9,
								getCelldata(offersheetname, i, 10));
						clickbyxpath(Driver, offersheetname, i, 11);
						wait10Seconds();
					}
				}
			}
		}
	}

	@Then("^User will see the Reference Number for ELife Premium$")
	public void user_will_see_the_Reference_Number_for_ELife_Premium()
			throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 3) {
					String deal = getCelldata("DealType", i, 0) + "-"
							+ getCelldata("DealType", i, 1);
					if (deal.equals("eLife Premium-true")) {
						String expected_email = getCelldata(offersheetname, i,
								10);
						String actual_email = getElementValueByXpath(Driver,
								"Offers", i, 12);
						System.out.print("Reference No is: "
								+ getElementValueByXpath(Driver,
										offersheetname, i, 13));
						Assert.assertEquals(expected_email, actual_email);
						clickbyxpath(Driver, offersheetname, i, 14);
						wait3Seconds();
						clickbyxpath(Driver, sheetname, i, 2);
					}
				}
			}
		}
	}
}
