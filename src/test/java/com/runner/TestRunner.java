package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features = {"src/test/resources/features/OnlinePurchase.feature"},
		glue = "com.stepsdefinitions",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun = true,
		snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,
		monochrome = true
		)

public class TestRunner {
	

}
