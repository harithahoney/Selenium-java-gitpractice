package ui;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	public static String browser = "Chrome";//External configuration from excel, csv etc
	// public static ChromeDriver driver;
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WebDriverManager.chromedriver().setup();
		// ChromeDriver driver = new ChromeDriver();

		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		//Checking with sauce demo application
		
		/*driver.get("https://www.saucedemo.com/");
		By usernameField = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		driver.findElement(usernameField).sendKeys("standard_user");
		By passwordField = RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
		driver.findElement(passwordField).sendKeys("secret_sauce");
		By loginButton= RelativeLocator.with(By.tagName("input")).below(passwordField);
		driver.findElement(loginButton).click();*/
		
		//check with demo application
		driver.get("https://phptravels.org/register.php");
		By firstnameField = RelativeLocator.with(By.tagName("input")).toLeftOf(By.id("inputLastName"));
		driver.findElement(firstnameField).sendKeys("Dummy");
		By lastnameField = RelativeLocator.with(By.tagName("input")).toRightOf(firstnameField);
		driver.findElement(lastnameField).sendKeys("fluffy");
		By companynameField = RelativeLocator.with(By.tagName("input")).above(By.id("inputAddress1"));
		driver.findElement(companynameField).sendKeys("seleniumcompany");
		By stateField = RelativeLocator.with(By.tagName("input")).below(By.id("inputAddress2"));
		driver.findElement(stateField).sendKeys("California");
		By nearestField = RelativeLocator.with(By.tagName("input")).near(By.id("stateinput"));
		System.out.println(nearestField);
		By emailField = RelativeLocator.with(By.tagName("input")).below(firstnameField).toLeftOf(By.id("inputPhone"));
		driver.findElement(emailField).sendKeys("testing-practice@gmail.com");
		
		
		
		
		
		
		
		
		
			

	}

}
