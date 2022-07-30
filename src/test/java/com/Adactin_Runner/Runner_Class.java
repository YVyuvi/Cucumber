package com.Adactin_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Adactin_Feature", glue = "com.Adactin_Stepdefinition", monochrome = true, strict = true, dryRun = false, tags = "~@Exclude", plugin = {
		"html:Report/Html_Report", "pretty", "json:Report/Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_Report.html" })
public class Runner_Class {

	public static WebDriver driver;

	@BeforeClass
	public static void Open_Browser() {
		driver = Base_Class.getBrowser("chrome");
	}

	@AfterClass
	public static void Close_Browser() {
		driver = Base_Class.close();
	}
}
