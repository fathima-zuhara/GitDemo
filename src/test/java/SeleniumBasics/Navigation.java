package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Navigation {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.ae/");
		driver.get("https://www.ebay.com/");
		driver.navigate().to("https://www.ebay.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
				
	}

}
