package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		System.out.println("Total links:" + linksList.size());

		for (int i = 0; i < linksList.size(); i++) {
			String text = linksList.get(i).getText();
			if (!text.isEmpty()) {
				System.out.println(text);
			}

		}

	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
