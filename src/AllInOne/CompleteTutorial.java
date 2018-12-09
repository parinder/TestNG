package AllInOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CompleteTutorial {
	FirefoxDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		driver = new FirefoxDriver();
		// Implicit Wait - work globally
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}

	@Test
	public void Basics() {
		// GoTo Browser
		driver.get("https://www.facebook.com");

		// Validate I'm at right web-page
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println(title + " : " + url);

		// PageSource
		driver.get("https://www.facebook.com");
		String pgsrc = driver.getPageSource();
		System.out.println(pgsrc);

		// BackToURL
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		driver.get("https://www.facebook.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(title.contains("Facebook - Log In or Sign Up"));

	}

	@Test
	public void locators() {

		// Locator-ID
		driver.get("https://www.google.com/");
		driver.findElementById("lst-ib").sendKeys("Hello Id Locator Bebe");

		// Locator-Name
		driver.get("https://www.facebook.com");
		driver.findElementByName("email").sendKeys("I'm Name Locator");

		// Locator LinkText
		driver.get("https://www.facebook.com");
		driver.findElementByLinkText("Forgot account?").click();

		// locator-Xpath
		driver.findElement(By.xpath("//*[@id='identify_email']")).sendKeys("I'm XPATH");
		driver.findElementByXPath("//input[@type='submit']").click();

		// locator-CSS Selector
		driver.findElementByCssSelector("button[id='loginbutton']").click();

		// locator - Xpath-Regular Expression
		driver.get("https://www.facebook.com");
		driver.findElementByXPath("//input[contains(@id,'u_0')]").click();

		// Grab Element by text()
		driver.get("https://www.facebook.com");
		driver.findElementByXPath("//*[text()='Log In']").click();

	}

	@Test
	public void automateWebElement() {
		// static DropDown
		driver.get("https://spicejet.com/");
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByIndex(1);
		s.selectByValue("USD");

		// Dynamic DropDown
		driver.get("https://spicejet.com/");

		// Explicit Wait - Work particular scanerio
		driver.findElementByXPath("//div[@id='divpaxinfo']").click();
		WebDriverWait delay = new WebDriverWait(driver, 5);
		delay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='hrefIncAdt']")));
		
		int i = 1;
		while (i < 5) {
			driver.findElementByXPath("//span[@id='hrefIncAdt']").click();
			i++;
		}
			// Checkbox validation
			driver.get("https://spicejet.com/");
			System.out.println(driver.findElementById("ctl00_mainContent_chk_friendsandfamily").isSelected());
			driver.findElementById("ctl00_mainContent_chk_friendsandfamily").click();
			System.out.println(driver.findElementById("ctl00_mainContent_chk_friendsandfamily").isSelected());

			// RadioButton
			driver.get("https://spicejet.com/");
			driver.findElementById("ctl00_mainContent_rbtnl_Trip_1").click();
			System.out.println(driver.findElementById("ctl00_mainContent_rbtnl_Trip_1").isSelected());

			// Alert
			driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
			driver.findElementByXPath("//input[@value='Confirmation Alert']").click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();

			// Ajax-Mouse Calls
			driver.get("https://www.amazon.com");
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-accountList']"))).build().perform();

			a.moveToElement(driver.findElementById("twotabsearchtextbox")).click().keyDown(Keys.SHIFT).sendKeys("bra")
					.doubleClick().contextClick().build().perform();

		}

	}


