package Annotations_After_Before;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
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
	
	@Test
	public void Invalid_Login() {
		driver.findElement(By.xpath("//input[@name='username']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("invalid");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("invalid");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		driver.close();
	}

}
