package SeleniumBasics;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetALL_URLs {
	public static void main(String[] args) {

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.ae/");
		//driver.manage().window().maximize();
		List<WebElement> GetALLUrl=driver.findElements(By.tagName("a"));
		int count= GetALLUrl.size();
		System.out.println("No.of URLSs :"+count);
		for (int i = 0; i<count; i++) {
			System.out.println(GetALLUrl.get(i).getText());
		}
		 
		driver.close();
	}

}
