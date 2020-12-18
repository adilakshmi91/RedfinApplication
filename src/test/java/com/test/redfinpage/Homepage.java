package com.test.redfinpage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.redfinutilities.RedfinTestBase;

public class Homepage extends RedfinTestBase {
	public WebDriver driver;

	public Homepage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Enter the text in searchbox
/*	@FindBy(id = "search-box-input")
	WebElement textBox;*/

	public void searchBox() {
		driver.findElement(By.id("search-box-input")).sendKeys("sunnyvale");
		driver.findElement(By.id("search-box-input")).sendKeys(Keys.ENTER);
		//textBox.sendKeys("Sunnyvale");
		//textBox.sendKeys(Keys.ENTER);

	}

	// click on searchbutton
	@FindBy(xpath = "//button[@aria-label='submit search'and@tabindex='0'][1]")
	WebElement searchButton;

	public void clickOnSearch() {
		searchButton.click();
	}

}
