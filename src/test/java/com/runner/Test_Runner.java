package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.MavinProject1.BaseClass;
import com.step.StepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\features\\1Adactin.feature", glue = "com.step", tags = "@tags",
				plugin = {"json:target/cucumber-report/cucumber.json",
						"html:target/cucumber-report/cucumber.html",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
						monochrome = true,
						dryRun = false)

public class Test_Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void stepUp() {
		
		driver = BaseClass.launchBrowser("chrome");
	}
	
	
	@AfterClass
	public static void colse() {

		BaseClass.browserClose();
		
		StepDefinition.logger.info("************* Test cases completed ****************************");
	}
	
}
