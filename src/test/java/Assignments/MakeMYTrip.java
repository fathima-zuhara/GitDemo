package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMYTrip {
	public static void main(String[] args) throws InterruptedException {
		
		String expectedDay="2";
		String expectedMonthYear="november 2023";
	   
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/span[@class='chNavText darkGreyText']")).click();
		driver.findElement(By.xpath("//ul/li[@data-cy='oneWayTrip']")).click();
		
	driver.findElement(By.id("fromCity")).click();
		//driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget activeWidget']/label")).click();
		driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin ']/div/input")).sendKeys("NewDelhi");
		List<WebElement>locationList= driver.findElements(By.cssSelector("//p[@class='code makeRelative']"));
			for (int i = 0; i < locationList.size(); i++) {
				String text=locationList.get(i).getText();
				System.out.println("Text is "+text);
				if (text.contains("New Delhi")) {
					locationList.get(i).click();
					break;
					
				}
				
			}	
		driver.findElement(By.id("toCity")).click();
		//driver.findElement(By.xpath("//div[@class='fsw_inputBox searchToCity inactiveWidget ']")).sendKeys("Goa");
		driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin']/div/input ")).sendKeys("goa");
		List<WebElement>locationList2= driver.findElements(By.cssSelector("//p[@class='code makeRelative']"));
		for (int i = 0; i < locationList2.size(); i++) {
			String text=locationList2.get(i).getText();
			System.out.println("Text is "+text);
			if (text.contains("Goa")) {
				locationList2.get(i).click();
				break;
				
			}
			
		}	
		while (true) {
			String CalenderMonthYear=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
			
			if(CalenderMonthYear.equals(expectedMonthYear))
			{
		driver.findElement(By.xpath("//div[text()='" +expectedDay+ "']")).click();
		break;
			}
			else
			{
				driver.findElement(By.xpath("//div/span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
		}
		Thread.sleep(2000);
	
	}


}
