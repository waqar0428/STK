package seleniumgluecode;

import jxl.Sheet;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Prepaid_Talk_Text_Surf extends Utils.UtilMethods{
	
	public static WebDriver Driver = LoginSteps.Driver;
	String sheetname = "DealType";
	String offersheetname = "Offers";
	
	@Given("^Click on Flip for Talk, Text & Surf Details$")
	public void click_on_Flip_for_Talk_Text_Surf_Details() throws Throwable {
		Sheet DealType = getsheet("Offers");
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 6) {
					String flow = getCelldata("DealType", 4, 0) + "-"
							+ getCelldata("DealType", 4, 1);
					if (flow.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer
								.equals("Talk Text & Surf-true")) {
							System.out.println(" Executing : "+dealoffer);
							clickbyxpath(Driver, offersheetname, i, 2);
							wait3Seconds();
						}
					}
				}
			}
		}
	}

	@Then("^Talk, Text & Surf Details will display$")
	public void talk_Text_Surf_Details_will_display() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 6) {
					String deal = getCelldata(sheetname, 4, 0) + "-"
							+ getCelldata(sheetname, 4, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer.equals("Talk Text & Surf-true")) {
							String exp_message = "All above packs can be repurchased multiple times";
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

	@Then("^user Click on Flip back for Talk, Text & Surf$")
	public void user_Click_on_Flip_back_for_Talk_Text_Surf() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 6) {
					String deal = getCelldata(sheetname, 4, 0) + "-"
							+ getCelldata(sheetname, 4, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer.equals("Talk Text & Surf-true")) {
							clickbyxpath(Driver, offersheetname, i, 4);
							wait3Seconds();
						}
					}
				}
			}
		}
	}

	@Then("^Select the Talk, Text & Surf Offer$")
	public void select_the_Talk_Text_Surf_Offer() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 6) {
					String deal = getCelldata(sheetname, 4, 0) + "-"
							+ getCelldata(sheetname, 4, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer.equals("Talk Text & Surf-true")) {
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

	@Then("^Enter the information to Notify Talk, Text & Surf Offer$")
	public void enter_the_information_to_Notify_Talk_Text_Surf_Offer() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 6) {
					String deal = getCelldata(sheetname, 4, 0) + "-"
							+ getCelldata(sheetname, 4, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer.equals("Talk Text & Surf-true")) {
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

	@Then("^User will display the Reference Number for Talk, Text & Surf$")
	public void user_will_display_the_Reference_Number_for_Talk_Text_Surf() throws Throwable {
		Sheet DealType = getsheet(offersheetname);
		if (DealType.getRows() > 0) {
			for (int i = 0; i < DealType.getRows(); i++) {
				if (i == 6) {
					String deal = getCelldata(sheetname, 4, 0) + "-"
							+ getCelldata(sheetname, 4, 1);
					if (deal.equals("Prepaid-true")) {
						String dealoffer = getCelldata(offersheetname, i, 0)
								+ "-" + getCelldata(offersheetname, i, 1);
						if (dealoffer.equals("Talk Text & Surf-true")) {
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
							String Nextoffer = getCelldata(offersheetname, 6, 0)
									+ "-" + getCelldata(offersheetname, 6, 1);
							if (Nextoffer
									.equals("Prepaid Visitor Line Talk & a Text-true")) {
								clickbyxpath(Driver, sheetname, 4, 2);
								Prepaid p = new Prepaid();
								p.user_select_the_Prepaid();
								p.click_on_Next_for_Prepaid_option();
								p.user_will_see_the_Prepaid_Page();
								wait3Seconds();
							}
						}
					}
				}
			}
		}
		Driver.close();
	}
}
