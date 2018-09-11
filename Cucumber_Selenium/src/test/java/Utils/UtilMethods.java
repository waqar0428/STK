package Utils;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class UtilMethods extends DriverFactory {

	public static void wait3Seconds() throws InterruptedException {
		Thread.sleep(3000);
	}

	public static Sheet getsheet(String SheetName) throws IOException,
			JXLException {
		FileInputStream fi = new FileInputStream(
				"src/test/resources/Sales_Toolkit.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet DriverSheet = wb.getSheet(SheetName);
		return DriverSheet;
	}

	public static String getCelldata(String SheetName, int rownum, int col)
			throws IOException, JXLException {
		FileInputStream fi = new FileInputStream(
				"src/test/resources/Sales_Toolkit.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet DriverSheet = wb.getSheet(SheetName);
		String exp_message = DriverSheet.getCell(col, rownum).getContents();
		return exp_message;
	}

	public static String getElementValueByXpath(WebDriver Driver,
			String SheetName, int rownum, int col) throws IOException,
			JXLException {
		FileInputStream fi = new FileInputStream(
				"src/test/resources/Sales_Toolkit.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet DriverSheet = wb.getSheet(SheetName);
		String exp_message = Driver.findElement(
				By.xpath(DriverSheet.getCell(col, rownum).getContents()))
				.getText();
		return exp_message;
	}

	public static void clickbyxpath(WebDriver Driver, String SheetName,
			int rownum, int col) throws IOException, JXLException {
		FileInputStream fi = new FileInputStream(
				"src/test/resources/Sales_Toolkit.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet DriverSheet = wb.getSheet(SheetName);
		WebElement event = Driver.findElement(By.xpath(DriverSheet.getCell(col,
				rownum).getContents()));
		event.click();
	}

	public static void clickbyid(WebDriver Driver, String SheetName,
			int rownum, int col) throws IOException, JXLException {
		FileInputStream fi = new FileInputStream(
				"src/test/resources/Sales_Toolkit.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet DriverSheet = wb.getSheet(SheetName);
		WebElement event = Driver.findElement(By.id(DriverSheet.getCell(col,
				rownum).getContents()));
		event.click();
	}

	public static void sendkeysbyxpath(WebDriver Driver, String SheetName,
			int rownum, int col, String Text) throws IOException, JXLException {
		FileInputStream fi = new FileInputStream(
				"src/test/resources/Sales_Toolkit.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet DriverSheet = wb.getSheet(SheetName);
		WebElement event = Driver.findElement(By.xpath(DriverSheet.getCell(col,
				rownum).getContents()));
		event.sendKeys(Text);
		;
	}

	public static void sendkeysbyid(WebDriver Driver, String SheetName,
			int rownum, int col, String Text) throws IOException, JXLException {
		FileInputStream fi = new FileInputStream(
				"src/test/resources/Sales_Toolkit.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet DriverSheet = wb.getSheet(SheetName);
		WebElement event = Driver.findElement(By.id(DriverSheet.getCell(col,
				rownum).getContents()));
		event.sendKeys(Text);
		;
	}

	public static void wait5Seconds() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void SpecialWait() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void Wait() throws InterruptedException {
		driver.wait(1, 5000);
	}

	public static void wait10Seconds() throws InterruptedException {
		Thread.sleep(10000);
	}

	public static void waitForVisibility(WebElement element) {
		new WebDriverWait(driver, 0).until(ExpectedConditions
				.visibilityOf(element));
	}

	public static void IsTitleDisplay(WebElement element) {
		assertTrue("Verification failed: Element1 and Element2 are not same.",
				(element).isDisplayed());
	}

	public static void waitForClickable(WebElement element) {
		new WebDriverWait(driver, 50).until(ExpectedConditions
				.elementToBeClickable(element));
	}

	public static boolean JsonResponse(String Request, String Method,
			int Response, String Comparer, String JsonBody) {
		boolean result = false;
		try {
			String Body = "";
			String Result;
			URL url = new URL(Request);
			HttpURLConnection httpURLConnection = (HttpURLConnection) url
					.openConnection();
			httpURLConnection.setRequestMethod(Method);
			httpURLConnection.addRequestProperty("Accept", "application/json");

			if (Method.equals("POST")) {
				httpURLConnection.addRequestProperty("Content-Type",
						"application/json");
				httpURLConnection.setDoOutput(true);
				OutputStreamWriter writer = new OutputStreamWriter(
						httpURLConnection.getOutputStream());
				writer.write(JsonBody);
				writer.flush();
			}

			int ResponseCode = httpURLConnection.getResponseCode();
			try {
				Assert.assertEquals(Response, ResponseCode);
				Result = "Passed";
				System.out.println(Result);
			} catch (AssertionError e) {
				Result = "Failed Assertion";
				System.out.println(Result);
			}
			BufferedReader httpResponseReader = new BufferedReader(
					new InputStreamReader(httpURLConnection.getInputStream()));
			String lineRead;
			while ((lineRead = httpResponseReader.readLine()) != null) {
				Body += lineRead;
			}
			System.out.println(Body);

			if (Body.contains(Comparer)) {
				Result = "Pass";
				System.out.println(Result);
				result = true;
			} else {
				Result = "Failed Comparer";
				System.out.println(Result);
				result = false;
			}
			httpResponseReader.close();
		} catch (Exception ex) {
			System.out.println("Error oOccur while Generating Respoonse Body:"
					+ ex);
		}
		return result;
	}

	public static void waitForPageLoadAndPageReady() {
		// wait2Seconds();
		waitForPageLoad();
		checkPageIsReady();
	}

	public static void waitForPageLoad() {

		Wait<WebDriver> wait = new WebDriverWait(driver, 30);
		wait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				((JavascriptExecutor) driver)
						.executeScript("return document.readyState");
				return String.valueOf(
						((JavascriptExecutor) driver)
								.executeScript("return document.readyState"))
						.equals("complete");
			}
		});
	}

	public static void checkPageIsReady() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String s = "";
		while (!s.equals("complete")) {
			s = (String) js.executeScript("return document.readyState");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
