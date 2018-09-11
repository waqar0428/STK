package seleniumgluecode;

import jxl.Sheet;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Prepaid_SurfLine_Offer extends Utils.UtilMethods {
	public static WebDriver Driver = SWYP_Offer.Driver;
	String sheetname = "DealType";
	String offersheetname = "Offers";

	@Given("^user select Visitor$")
	public void user_select_Visitor() throws Throwable {
		Sheet DealType = getsheet(sheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 4) {
					String deal = getCelldata(sheetname, i, 0) + "-"
							+ getCelldata(sheetname, i, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						System.out.print("Executing Scenario is: " + dealoffer);
						clickbyxpath(Driver, sheetname, i, 7);
						wait3Seconds();
					}
				}
			}
		}
	}

	@When("^Click on Next to Visitor$")
	public void click_on_Next_to_Visitor() throws Throwable {
		Sheet DealType = getsheet(sheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 4) {
					String deal = getCelldata(sheetname, i, 0) + "-"
							+ getCelldata(sheetname, i, 1);
					if (deal.equals("Prepaid-true")) {
						@SuppressWarnings("unused")
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						clickbyxpath(Driver, sheetname, i, 4);
						wait3Seconds();
					}
				}
			}
		}
	}

	@SuppressWarnings("unused")
	@Then("^user will see Vistor Surf Line Offers$")
	public void user_will_see_Vistor_Surf_Line_Offers() throws Throwable {
		Sheet DealType = getsheet(sheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 4) {
					String deal = getCelldata(sheetname, i, 0) + "-"
							+ getCelldata(sheetname, i, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						String exp_message = "VISITOR";
						String actual = getElementValueByXpath(Driver,
								sheetname, i, 8);
						Assert.assertEquals(exp_message, actual);
						wait3Seconds();
					}
				}
			}
		}
	}

	@Then("^Click on Flip for Surf Line Details$")
	public void click_on_Flip_for_Surf_Line_Details() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 4) {
					String deal = getCelldata(sheetname, i, 0) + "-"
							+ getCelldata(sheetname, i, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer.equals("Prepaid Visitor Surf Line-true")) {
							clickbyxpath(Driver, offersheetname, i, 2);
							wait3Seconds();
						}
					}
				}
			}
		}
	}

	@Then("^Surf Line Details will display$")
	public void surf_Line_Details_will_display() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 4) {
					String deal = getCelldata(sheetname, i, 0) + "-"
							+ getCelldata(sheetname, i, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer.equals("Prepaid Visitor Surf Line-true")) {
							String exp_message = "For abc the first time to purchase a VISITOR line there is a charge of AED 100";
							String actual = getElementValueByXpath(Driver,
									offersheetname, i, 3);
							Assert.assertEquals(exp_message, actual);
							wait3Seconds();
						}
					}
				}
			}
		}
	}

	@Then("^user Click on Flip back for Surf Line$")
	public void user_Click_on_Flip_back_for_Surf_Line() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 4) {
					String deal = getCelldata(sheetname, i, 0) + "-"
							+ getCelldata(sheetname, i, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer.equals("Prepaid Visitor Surf Line-true")) {
							clickbyxpath(Driver, offersheetname, i, 4);
							wait3Seconds();
						}
					}
				}
			}
		}
	}

	@Then("^Select the Surf Lne Offer$")
	public void select_the_Surf_Lne_Offer() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 4) {
					String deal = getCelldata(sheetname, i, 0) + "-"
							+ getCelldata(sheetname, i, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer.equals("Prepaid Visitor Surf Line-true")) {
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
	}

	@Then("^Enter the information to Notify Surf Line Offer$")
	public void enter_the_information_to_Notify_Surf_Line_Offer()
			throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 4) {
					String deal = getCelldata(sheetname, i, 0) + "-"
							+ getCelldata(sheetname, i, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer.equals("Prepaid Visitor Surf Line-true")) {
							sendkeysbyid(Driver, offersheetname, i, 9,
									getCelldata(offersheetname, i, 10));
							clickbyxpath(Driver, offersheetname, i, 11);
							wait10Seconds();
						}
					}
				}
			}
		}
	}

	@Then("^User will display the Reference Number for Surf Line$")
	public void user_will_display_the_Reference_Number_for_Surf_Line()
			throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 4) {
					String deal = getCelldata(sheetname, i, 0) + "-"
							+ getCelldata(sheetname, i, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer.equals("Prepaid Visitor Surf Line-true")) {
							String expected_email = getCelldata(offersheetname,
									i, 10);
							String actual_email = getElementValueByXpath(
									Driver, "Offers", i, 12);
							System.out.print("Reference No is: "
									+ getElementValueByXpath(Driver,
											offersheetname, i, 13));
							Assert.assertEquals(expected_email, actual_email);
							wait3Seconds();
							clickbyxpath(Driver, offersheetname, i, 14);
							wait3Seconds();
							String Nextoffer = getCelldata(offersheetname, 5, 0)
									+ "-" + getCelldata(offersheetname, 5, 1);
							if (Nextoffer
									.equals("Prepaid Visitor Line Talk Text-true")) {
								clickbyxpath(Driver, sheetname, i, 2);
								Prepaid p = new Prepaid();
								p.user_select_the_Prepaid();
								p.click_on_Next_for_Prepaid_option();
								p.user_will_see_the_Prepaid_Page();
								wait3Seconds();
								user_select_Visitor();
								click_on_Next_to_Visitor();
								user_will_see_Vistor_Surf_Line_Offers();
							}
						}
					}
				}
			}
		}
	}
}
