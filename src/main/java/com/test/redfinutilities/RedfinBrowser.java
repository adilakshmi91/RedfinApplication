package com.test.redfinutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedfinBrowser  {
	public static WebDriver driver;

	public void getBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.redfin.com/");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("REDFIN"));
		System.out.println("Application launched");
		driver.manage().window().maximize();
	}

	public void quitBrowser() {
		driver.close();
	}

}
