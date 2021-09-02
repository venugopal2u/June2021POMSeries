package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	@BeforeSuite
	public void DBConnection() {
		System.out.println("BS----DB Connection");
	}

	@BeforeTest
	public void createUser() {
		System.out.println("BT---create User");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC---launch browser");
	}

	@BeforeMethod
	public void login() {
		System.out.println("BM---login");

	}

	@Test
	public void homePageTest() {
		System.out.println("home page test");

	}

	@Test
	public void addToCartpageTest() {
		System.out.println("add to cart test");
	}

	@Test
	public void paymentPageTest() {
		System.out.println("payment page test");
	}

	@AfterMethod
	public void logout() {
		System.out.println("AM---logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC---closeBrowser");

	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AT----delete user");
	}

	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS---DisconnectDB");
	}

}
