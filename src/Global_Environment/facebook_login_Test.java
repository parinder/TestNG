package Global_Environment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class facebook_login_Test {

	WebDriver driver;
	String driverPath = "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver";
	Properties prop = new Properties();

	@BeforeTest
	public void setup() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", driverPath);
		FileInputStream fis = new FileInputStream(
				"/home/parinder/eclipse-workspace/Testing_Projects/TestNG_Projects/src/Global_Environment/DataDriven.properties");
		prop.load(fis);
		driver = new FirefoxDriver();
		driver.get(prop.getProperty("urlfb"));
		Thread.sleep(3000L);
	}

	@Test
	public void Invalid_Login() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("loginbutton"));
		driver.close();

	}

}
