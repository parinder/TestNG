package Global_Environment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Insta_login_Test {
	
	WebDriver driver;
	String driverPath = "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver";
	Properties prop=new Properties();
	
	@BeforeTest
	public void setup() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver =new FirefoxDriver();
		FileInputStream fis=new FileInputStream("/home/parinder/eclipse-workspace/Testing_Projects/TestNG_Projects/src/Global_Environment/DataDriven.properties");
		prop.load(fis);
		driver.get(prop.getProperty("urlinsta"));
		Thread.sleep(3000L);
	}
	
	@Test
	public void Invalid_Login() {
		driver.findElement(By.xpath("//input[@name='username']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		driver.close();
	}

}
