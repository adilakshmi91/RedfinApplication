package com.test.redfinstepdefin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.test.redfinpage.Homepage;
import com.test.redfinutilities.RedfinTestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Redfinhome extends RedfinTestBase{
	public WebDriver driver;

	Homepage pages;
    

	@Given("^I Launch the redfin application$")
	public void i_Launch_the_redfin_application() throws Throwable {
		pages=new Homepage(driver);
         trigerring();
		System.out.println("Redfin Application Launched");
	}

	@When("^I want to enter text in searchbox$")
	public void i_want_to_enter_text_in_searchbox() throws Throwable {
		pages=new Homepage(driver);
		
         pages.searchBox();
		System.out.println("entered the text sucessfully");

	}

	@Then("^I click on search button$")
	public void i_click_on_search_button() throws Throwable {

		pages.clickOnSearch();

	}

	@Then("^I close the Application$")
	public void i_close_the_Application() throws Throwable {
		teardowndependency();
		pages = new Homepage(driver);
		System.out.println("Redfin Application closed");

	}
}
