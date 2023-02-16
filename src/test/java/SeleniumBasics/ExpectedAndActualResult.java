package SeleniumBasics;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpectedAndActualResult {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//*String expTitle="Facebook - uae";<----for failed condition
		//String expTitle="Facebook - log in or sign up";
		//String actTitle=driver.getTitle();
		//if (expTitle.equals(actTitle)) {
			//System.out.println("TestCase Passed");	
			
		//}else{
			//System.out.println("TC Failed");
		//}
	driver.findElement(By.linkText("Sign Up")).click();
	String ExpUrl="https://www.facebook.com/register/";
	 String ActUrl=driver.getCurrentUrl();
	if (ExpUrl.equals(ActUrl)) {
		System.out.println("TC Passed"); 
	} else {
System.out.println("TC Failed");
	}
driver.close();
	}

}
