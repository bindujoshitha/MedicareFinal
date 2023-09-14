package com.capstone.medicare.Medicareproject;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentreportforsupplier {
	ExtentReports extent;
	public void Configreport() {
		String path=ConstantsFile.ReportPath1;
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("MEDICARE PROJECT");
		reporter.config().setDocumentTitle("SUPPLIER PROFILE TESTING ");
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Bindu P");
	}
	public void CreateTest() {
		extent.createTest("SUPPLIER PROFILE TESTING");
	}
	public void FlushTest() {
		extent.flush();
	}
}
