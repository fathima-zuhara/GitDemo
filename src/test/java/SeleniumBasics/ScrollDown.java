package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ScrollDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.ae/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,-1400)");
        Thread.sleep(2000);
        driver.close();
}
}