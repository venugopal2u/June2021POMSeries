package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser = "chrome";

		BrowserUtil brUtil = new BrowserUtil();

		WebDriver driver = brUtil.launchBrowser(browser);
		brUtil.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");

		System.out.println(brUtil.getPageTitle());

		By firstName = By.id("Form_submitForm_FirstName");
		By secondName = By.id("Form_submitForm_LastName");

		By email = By.id("Form_submitForm_Email");
		By jobTitle = By.id("Form_submitForm_JobTitle");
		By companyName = By.id("Form_submitForm_CompanyName");
		By phoneNumber = By.id("Form_submitForm_Contact");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Venugopal");
		eleUtil.doSendKeys(secondName, "Gookanti");
		eleUtil.doSendKeys(email, "venugopal2u@gmail.com");
		eleUtil.doSendKeys(jobTitle, "Engineer");
		eleUtil.doSendKeys(companyName, "TCS");
		eleUtil.doSendKeys(phoneNumber, "9886049705");

		// brUtil.closeBrowser();
	}

}
