package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tinymce");
		driver.switchTo().frame("mce_0_ifr");
		Thread.sleep(2000);
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("fathima");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.quit();
		
	}

}
