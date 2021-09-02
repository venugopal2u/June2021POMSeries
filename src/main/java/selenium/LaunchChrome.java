package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\venug\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\venug\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		
		System.out.println("Page title is:"+title);
		
		if(title.equals("Google")){
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		driver.quit();
		
		
	}

}
