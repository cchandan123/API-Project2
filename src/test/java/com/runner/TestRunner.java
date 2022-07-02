package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.reports.JVMReport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Nishu\\eclipse-workspace111new\\AdactinHotelAutomation\\src\\test\\resources\\Adactin\\BookingHotel.feature", glue = {
		"practise.stepdefinition" }, monochrome = true, plugin = { "pretty",
				"json:src/test/resources/Reports/adactin.json" })



public class TestRunner {
	@AfterClass
	public static void cucumberReport() {
		JVMReport.cucumberReport("/AdactinHotelAutomation/src/test/resources/Reports/adactin.json");
	}

}
