package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Mathoba {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://mbpl.l2s.biz/selfcare/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.xpath("//input[@placeholder='Enter username here']"));
		username.sendKeys("f_kumbha");
		username.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Your password here']")).sendKeys("mbs1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Renew']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Pay')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='UPI']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@list='saved-vpa-list']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//div[@class='pay-btn hidden_xs']//child::button")).click();
		
		
		
		
		

		
		
		
	}

}
