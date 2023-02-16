package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
	    driver.manage().window().maximize();
		//driver.findElement(By.id("alertexamples")).click();
		//Thread.sleep(2000);
		//driver.switchTo().alert().accept();//for accepting
		//driver.switchTo().alert().dismiss();
		//Thread.sleep(2000);
		
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Fathima");
		driver.switchTo().alert().accept();
		//for saving 
    	//Alert PromptAlert = driver.switchTo().alert();
    	//PromptAlert.getText();
    	//PromptAlert.sendKeys("Fathima");
    	//PromptAlert.accept();
		//Thread.sleep(2000);
		
		driver.close();
	
	}


		
	}

	
	
		
	


