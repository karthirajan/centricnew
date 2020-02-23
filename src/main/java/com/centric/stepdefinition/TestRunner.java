package com.centric.stepdefinition;

import java.io.File;


import java.io.File;

import org.joda.time.LocalDateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\Features\\NewSeason.feature",
                 glue = "com.centric.stepdefinition",
                 plugin = {"html:target","json:target/reports.json"})

public class TestRunner {

	@AfterTest
	public void tearDown() {
		//update test information to your report
		LoginPageSteps.extent.flush();
		//Clear all extent report resources
		//LoginPageSteps.extent.close();		// to write or update test information to reporter
	
	}
	
}
