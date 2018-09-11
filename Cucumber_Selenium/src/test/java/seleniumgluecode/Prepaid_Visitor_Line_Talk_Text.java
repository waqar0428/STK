package seleniumgluecode;

import jxl.Sheet;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Prepaid_Visitor_Line_Talk_Text extends Utils.UtilMethods {

	public static WebDriver Driver = eLife_Premium_Offer.Driver;
	String sheetname = "DealType";
	String offersheetname = "Offers";

	@Given("^Click on Flip for Line Talk & Text Details$")
	public void click_on_Flip_for_Line_Talk_Text_Details() throws Throwable {
		Sheet DealType = getsheet("Offers");
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 5) {
					String flow = getCelldata("DealType", 4, 0) + "-"
							+ getCelldata("DealType", 4, 1);
					if (flow.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						System.out.println(dealoffer);
						if (dealoffer
								.equals("Prepaid Visitor Line Talk Text-true")) {
							System.out.println("Testing");
							clickbyxpath(Driver, offersheetname, i, 2);
							wait3Seconds();
						}
					}
				}
			}
		}
	}

	@Then("^Line Talk & Text Details will display$")
	public void line_Talk_Text_Details_will_display() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 5) {
					String deal = getCelldata(sheetname, 4, 0) + "-"
							+ getCelldata(sheetname, 4, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer.equals("Prepaid Visitor Line Talk Text-true")) {
							String exp_message = "After that any of the above packs can be repurchased for only AED 75";
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

	@Then("^user Click on Flip back for Line Talk & Text$")
	public void user_Click_on_Flip_back_for_Line_Talk_Text() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 5) {
					String deal = getCelldata(sheetname, 4, 0) + "-"
							+ getCelldata(sheetname, 4, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer.equals("Prepaid Visitor Line Talk Text-true")) {
							clickbyxpath(Driver, offersheetname, i, 4);
							wait3Seconds();
						}
					}
				}
			}
		}
	}

	@Then("^Select the Line Talk & Text Offer$")
	public void select_the_Line_Talk_Text_Offer() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 5) {
					String deal = getCelldata(sheetname, 4, 0) + "-"
							+ getCelldata(sheetname, 4, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer.equals("Prepaid Visitor Line Talk Text-true")) {
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

	@Then("^Enter the information to Notify Line Talk & Text Offer$")
	public void enter_the_information_to_Notify_Line_Talk_Text_Offer()
			throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 5) {
					String deal = getCelldata(sheetname, 4, 0) + "-"
							+ getCelldata(sheetname, 4, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer.equals("Prepaid Visitor Line Talk Text-true")) {
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

	@Then("^User will display the Reference Number for Line Talk & Text$")
	public void user_will_display_the_Reference_Number_for_Line_Talk_Text()
			throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 5) {
					String deal = getCelldata(sheetname, 4, 0) + "-"
							+ getCelldata(sheetname, 4, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer.equals("Prepaid Visitor Line Talk Text-true")) {
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
							wait5Seconds();
							String Nextoffer = getCelldata(offersheetname, 6, 0)
									+ "-" + getCelldata(offersheetname, 6, 1);
							if (Nextoffer
									.equals("Talk Text & Surf-true")) {
								clickbyxpath(Driver, sheetname, 4, 2);
								Prepaid p = new Prepaid();
								p.user_select_the_Prepaid();
								p.click_on_Next_for_Prepaid_option();
								p.user_will_see_the_Prepaid_Page();
								wait3Seconds();
								Prepaid_SurfLine_Offer pso = new Prepaid_SurfLine_Offer();
								pso.user_select_Visitor();
								pso.click_on_Next_to_Visitor();
								pso.user_will_see_Vistor_Surf_Line_Offers();
							}
						}
					}
				}
			}
		}
	}
}
