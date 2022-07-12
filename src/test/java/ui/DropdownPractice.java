package ui;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// check single select dropdown
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement ddown = driver.findElement(By.xpath("//select[@name='SiteMap']"));
		Select s1 = new Select(ddown);
		s1.selectByIndex(2);
		Thread.sleep(2000);
		s1.selectByVisibleText("doc 3");
		Thread.sleep(2000);
		s1.selectByValue("mno");
		Thread.sleep(2000);
		List<WebElement> allselectedItems= s1.getAllSelectedOptions();
		System.out.println(allselectedItems.size());
		Thread.sleep(2000);
		
		//check multi select dropdown
		Select s2 = new Select(driver.findElement(By.xpath("//select[@id='multiselect1']")));
		s2.selectByVisibleText("Swift");
		Thread.sleep(2000);
		s2.selectByIndex(2);
		Thread.sleep(2000);
		s2.selectByValue("audix");
		Thread.sleep(2000);
		WebElement frstSelectedOption = s2.getFirstSelectedOption();
		System.out.println(frstSelectedOption.getText());
		Thread.sleep(2000);
		s2.deselectByVisibleText("Hyundai");
		Thread.sleep(2000);
		List<WebElement> allselectedItemsofMultiddown = s2.getAllSelectedOptions();
		System.out.println(allselectedItemsofMultiddown.size());
		Thread.sleep(2000);
		s2.deselectAll();
		
		
		
	}

}
