package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.id("dropdown"));
		Select sc=new Select(dropdown);
		//Selection can be done in 3 ways
		//sc.selectByIndex(1);
		//sc.selectByValue("2");
		sc.selectByVisibleText("Option 1");
		
	}

}
