package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
        
		driver.navigate().forward();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement cb1=driver.findElement(By.xpath("//form/input[1]"));
		System.out.println(" Check box 1");
		System.out.println("Check box1 displayed?"+cb1.isDisplayed());	
		System.out.println("Check box1 Enabled?"+cb1.isEnabled());
		System.out.println("Check box1 Selected?"+cb1.isSelected());
		Thread.sleep(2000);
		cb1.click();
		
		System.out.println();
		
		System.out.println(" Check box 2");
		WebElement cb2=driver.findElement(By.xpath("//form/input[2]"));
		System.out.println("Check box2 displayed?"+cb2.isDisplayed());	
		System.out.println("Check box2 Enabled?"+cb2.isEnabled());
		System.out.println("Check box2 Selected?"+cb2.isSelected());
		
		driver.close();
	
}

}
