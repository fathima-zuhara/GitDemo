package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {
public static void main(String[] args) throws InterruptedException {
//		mousehover();
//		keyboard();
	draganddrop();
}
	 public static void mousehover()
	 {
		 WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.com/");
		    WebElement deals=driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
		    Actions act =new Actions(driver);
		    act.moveToElement(deals).build().perform();
	 }
	 
	 public static void draganddrop() throws InterruptedException
	 {
		 WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://jqueryui.com/droppable/");
			Thread.sleep(1000);
			WebElement frame=driver.findElement(By.xpath("//iframe"));
			driver.switchTo().frame(frame);
			WebElement drag=driver.findElement(By.id("draggable"));
			WebElement drop=driver.findElement(By.id("droppable"));
			Actions act =new Actions(driver);
			act.dragAndDrop(drag, drop).build().perform();
			Thread.sleep(1000);
	 }
	 
	 
	 
	 public static void keyboard()
	 {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.id("email"));
		Actions act=new Actions(driver);
		act.click(username).keyDown(Keys.SHIFT).sendKeys("admin").keyUp(Keys.SHIFT).build().perform();
		
	 


}
}