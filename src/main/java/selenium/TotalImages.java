package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		By images = By.tagName("img");

		List<WebElement> imagesList = getElements(images);

		System.out.println("Total Images:" + imagesList.size());
		
		for(WebElement e:imagesList) {
			String altValue=e.getAttribute("alt");
			String srcValue=e.getAttribute("src");
			System.out.println(altValue+"--->"+srcValue);
		}

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
