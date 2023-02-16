package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//1.id:is a unique locator -- 1st preference
		//driver.findElement(By.id("email")).sendKeys("anyone@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("password");
		//2.name:is a unique locator --1
		//driver.findElement(By.name("login")).click();
		//3.xpath -- 2
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anyone@gmail.com");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
		//driver.findElement(By.name("login")).click();
		//4. cssSelector-- 2
		//driver.findElement(By.cssSelector("#email")).sendKeys("anyone@gmail.com");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("password");
		//driver.findElement(By.name("login")).click();
		//5. linkText:only for links -- 3
		//driver.findElement(By.linkText("Forgot password?")).click();
		//driver.findElement(By.linkText("Create a Page")).click();
		//6. Partial LinkText:only for links but not recomended -- 6
		//give a part of link
		//driver.findElement(By.partialLinkText("Forgot")).click();
		//7.className:not recomended bcz same classname might br exist 
		//is not unique  . it can be duplicate-- 5
		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("anyone@gmail.com");
		driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("password");
		driver.findElement(By.name("login")).click();
		
	}

}
