package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		By lang = By.xpath("//div[@id='SIvCob']/a");

		List<WebElement> langList = driver.findElements(lang);

		System.out.println("Total:" + langList.size());

		for (WebElement e : langList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("తెలుగు")) {
				e.click();
				break;
			}
		}

	}
}
