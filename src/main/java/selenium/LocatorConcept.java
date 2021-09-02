package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("Venugopal");

		// driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("Gookanti");

		// 2nd approach
		// WebElement firstName=driver.findElement(By.id("Form_submitForm_FirstName"));

		// WebElement secondName=driver.findElement(By.id("Form_submitForm_LastName"));

		// firstName.sendKeys("Venugopal");

		// secondName.sendKeys("Gookanti");

		// 3rd BY locator

		// By firstName=By.id("Form_submitForm_FirstName");
		// By secondName=By.id("Form_submitForm_LastName");

		// WebElement fn_ele=driver.findElement(firstName);
		// WebElement ln_ele=driver.findElement(secondName);

		// fn_ele.sendKeys("VenuGopal");
		// ln_ele.sendKeys("Gookanti");

		// 4th: generic method
		By firstName = By.id("Form_submitForm_FirstName");
		By secondName = By.id("Form_submitForm_LastName");

		getElement(firstName).sendKeys("Venugopal");
		getElement(secondName).sendKeys("Gookanti");

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
