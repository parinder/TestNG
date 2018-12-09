package Parameterizing_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
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
	@Parameters({"user", "password"})
	@Test
	public void Invalid_Login(String usrnamefb, String paswrdfb) {
		driver.findElement(By.id("email")).sendKeys(usrnamefb);
		driver.findElement(By.id("pass")).sendKeys(paswrdfb);
		driver.findElement(By.id("loginbutton"));
		driver.close();
		
	}
	

}
