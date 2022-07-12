package ui;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPractice {

	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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
		
		//check with demo application
		driver.get("https://phptravels.org/register.php");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[starts-with(@id,'inputLast')]")).sendKeys("application");
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("testing@gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='flag-container']//following-sibling::input")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='companyname']//self::input")).sendKeys("dummycompany");
		driver.findElement(By.xpath("//div[@class='form-group prepend-icon']//descendant::input[@name='address1']")).sendKeys("Streetaddress testing");
		driver.findElement(By.xpath("//div[@class='form-group prepend-icon']//descendant-or-self::input[@name='address2']")).sendKeys("Street2 address testing");
		driver.findElement(By.xpath("//input[@name='city' and @id='inputCity']")).sendKeys("testingcity");
		driver.findElement(By.xpath("//label[@id='inputStateIcon']//following-sibling::input")).sendKeys("testingstate");
		driver.findElement(By.xpath("//label[@for='inputPostcode']//following::input[@name='postcode']")).sendKeys("776655");
		driver.findElement(By.xpath("//span[@class='field-help-text']//preceding-sibling::input")).sendKeys("987654321");
		driver.findElement(By.xpath("//label[@for='inputNewPassword1']//following::input[@name='password']")).sendKeys("passwordtesting");
		driver.findElement(By.xpath("//input[@type='checkbox']//preceding::span[@class='bootstrap-switch-label']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			

	}

}
