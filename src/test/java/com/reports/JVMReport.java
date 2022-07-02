package com.reports;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.ReportBuilder;


public class JVMReport {
	public static void cucumberReport(String json) {
		File f = new File("C:\\Users\\Nishu\\eclipse-workspace111new\\AdactinHotelAutomation\\src\\test\\java\\com\\reports\\JVMReport.java");

		net.masterthought.cucumber.Configuration c = new net.masterthought.cucumber.Configuration(f, "AdactinHotelAutomation");
		c.addClassifications("SprintNumber", "3");
		c.addClassifications("OSName", "Windows");
		c.addClassifications("OSVersion", "10");
		c.addClassifications("BrowserName", "GooogleChrome");
		c.addClassifications("BrowserVersion", "101");

		List<String> l = new ArrayList<>();
		l.add(json);

		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();

	}

}
