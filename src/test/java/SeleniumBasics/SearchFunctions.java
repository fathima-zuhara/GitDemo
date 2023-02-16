package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchFunctions {
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://www.amazon.ae/");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Ladies bags");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		driver.get("https://www.noon.com/");
		driver.findElement(By.id("searchbar")).sendKeys("Ladies bags");
		
	}

}
