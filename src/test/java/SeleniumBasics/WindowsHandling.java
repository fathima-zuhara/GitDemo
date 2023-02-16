package SeleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumframework.com/practiceform/");
		driver.manage().window().maximize();
		String parent_window=driver.getWindowHandle();
		System.out.println("Get Parent window ID"+parent_window);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.id("button1")).click();
		Thread.sleep(2000);
		//at this point there are 2 windows
		 Set<String> all_windows= driver.getWindowHandles();
		 String child_window=null;
		 for (String abc : all_windows) {
			 
			 //identifying the child window
			 if (!(abc.equals(parent_window))) {
			child_window=abc;
			}
			
		}
		 System.out.println("Get Child window ID"+child_window);
		 driver.switchTo().window(child_window);
		 //after the above line of code,driver is pointing to child window
		System.out.println( driver.getTitle());
		
		//want to print the title of parent window
		driver.switchTo().window(parent_window);
		 System.out.println(driver.getTitle());
		 driver.quit();
		 //close:will only close the current window
		 //quit:will close every windows
	}

}
