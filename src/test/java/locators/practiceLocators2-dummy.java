package locators;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://uat-rmp.test.subway.com");

	}
	
	@Test
	public void login() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://uat-rmp.test.subway.com");
	}
	
	
	//Added by Te1
	@Test
	public void logout() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://uat-rmp.test.subway.com");
		system.out.println("logout")
	}


}
