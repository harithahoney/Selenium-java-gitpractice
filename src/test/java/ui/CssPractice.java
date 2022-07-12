package ui;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssPractice {

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
		driver.findElement(By.cssSelector("input#inputFirstName")).sendKeys("css tseting firstname");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("css last name");
		driver.findElement(By.cssSelector("input#inputEmail[type='email']")).sendKeys("css eamil testing");
		driver.findElement(By.cssSelector("input[name$='number'][name^='phone']")).sendKeys("998877665544");
		driver.findElement(By.cssSelector("div[class='form-group prepend-icon'] input[name='companyname']")).sendKeys("xyz company");
		driver.findElement(By.cssSelector("label[for='inputAddress1'] +input[name='address1']")).sendKeys("Street address testing");
		driver.findElement(By.cssSelector("div[class='control']>:first-child")).sendKeys("111111");
		driver.findElement(By.cssSelector("div.bootstrap-switch-container>:nth-of-type(2)")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			

	}

}
