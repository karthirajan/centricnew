package com.centric.stepdefinition;

import java.io.File;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.centric.resources.Commonactions;
import com.relevantcodes.extentreports.ExtentReports;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions {
	
	Commonactions ca = new Commonactions();
	private static final String ITestResult = null;
	public static ExtentReports extent;
	com.relevantcodes.extentreports.ExtentTest logger;
	
	@Before
	public void before() {

		 ca.launch("https://win16sql16-qa.centricsoftware.com/WebAccess/login.html");

	}
	
	@After
	public void after() {

		
	}

}
