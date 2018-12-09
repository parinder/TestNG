package Parameterizing_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Insta_login_Test {
	
	WebDriver driver;
	String driverPath = "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver";
	
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver =new FirefoxDriver();
		driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
		Thread.sleep(3000L);
	}
	@Parameters({"user", "password"})
	@Test
	public void Invalid_Login(String usrnameInsta, String paswrdInsta) {
		driver.findElement(By.xpath("//input[@name='username']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usrnameInsta);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(paswrdInsta);
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		driver.close();
	}

}
