package com.test.redfinutilities;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class RedfinTestBase {
	public WebDriver driver;
	RedfinBrowser redfinbrow=new RedfinBrowser();
	
	
	public void  trigerring() {
		redfinbrow.getBrowser();
		
	}
	
	public void teardowndependency() {
		redfinbrow.quitBrowser();
	}

}
