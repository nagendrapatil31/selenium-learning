package com.practice.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAddCart {

	public WebDriver driver;

	@BeforeMethod
	public void launchingBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void acts() throws InterruptedException {

		WebElement scrollToElement = driver.findElement(By.xpath("//h5[text()='Book Store Application']//parent::div"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", scrollToElement );
		
	
		Thread.sleep(2000);
		scrollToElement.click();

	}

	@AfterMethod
	public void clearingUp() {
		if (driver != null) {
			driver.quit();
		}
	}

}
