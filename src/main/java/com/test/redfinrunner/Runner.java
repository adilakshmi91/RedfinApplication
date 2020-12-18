package com.test.redfinrunner;


import cucumber.api.CucumberOptions;



@CucumberOptions(features="RedfinFeature\\RedfinFeatures.feature", glue= {"com.test.redfinstepdefin"} ,plugin = {
		"html:ExtentReports/cucumber-report" })
public class Runner {

}
