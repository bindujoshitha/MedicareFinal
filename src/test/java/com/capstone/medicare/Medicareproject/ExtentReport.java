package com.capstone.medicare.Medicareproject;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ExtentReport {
	ExtentReports extent;
	public void Configreport() {
		String path=ConstantsFile.ReportPath;
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("MEDICARE PROJECT");
		reporter.config().setDocumentTitle("USER PROFILE TESTING");
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Bindu P");
	}
	public void CreateTest() {
		extent.createTest("USER PROFILE TESTING");
	}
	public void FlushTest() {
		extent.flush();
	}
}
