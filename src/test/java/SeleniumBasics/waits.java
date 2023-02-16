package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waits {
   public static void main(String[] args) {
//	   implicitwait();
	   explictwait();
   }
   public static void implicitwait() {
	

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
//	driver.get("https://url_that_delays_loading");
//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//	driver.findElement(By.id("reload-button"));
	
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.findElement(By.linkText("Forgot password?")).click();
	driver.findElement(By.name("email")).sendKeys("myemail");

	
   }
   public static void explictwait() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumframework.com/practiceform/");
		driver.findElement(By.id("timingAlert")).click();
		
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(20));
		wt.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.quit();
}
}

