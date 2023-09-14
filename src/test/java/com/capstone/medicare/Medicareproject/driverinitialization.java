package com.capstone.medicare.Medicareproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverinitialization  {

	public static WebDriver getdriver() {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins*=");
		WebDriver driver=new EdgeDriver();	
				return driver;
			}
}
