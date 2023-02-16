package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApp {
	
		public static void main(String[] args) {
			//Step 1
			WebDriverManager.chromedriver().setup();
			//below line is responsible to open browser
			WebDriver driver= new ChromeDriver();
			//Step 2:Enter the URL
		driver.get("https://www.facebook.com/");
		//Step 3: Enter the User name
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("admin@gmail.com");
		//Step 4: Enter the password
		driver.findElement(By.id("pass")).sendKeys("password");
		//Step 5:Click
		driver.findElement(By.name("login")).click();
		//Step 6:close the app
		driver.close();
		
		

}
}