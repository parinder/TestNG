package Facebook_Insta_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class facebook_login_Test {
	
	WebDriver driver;
	String driverPath = "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver";
	
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000L);
	}
	
	@Test
	public void Invalid_Login() {
		driver.findElement(By.id("email")).sendKeys("invalid_UserName");
		driver.findElement(By.id("pass")).sendKeys("invalid_Password");
		driver.findElement(By.id("loginbutton"));
		driver.close();
		
	}
	

}
