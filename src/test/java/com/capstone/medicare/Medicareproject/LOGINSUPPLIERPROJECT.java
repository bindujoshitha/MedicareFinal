package com.capstone.medicare.Medicareproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LOGINSUPPLIERPROJECT extends extentreportforsupplier{
	@BeforeTest()
	public void before() {
			System.out.println("SUPPLIER Profile login Started");
		}
	@Test()
	public void LOGINUSERPROFILE() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8081/medicare/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		String url=driver.getCurrentUrl();
		Configreport();
		CreateTest();
		System.out.println("URl:"+url);
		String Email="bindu"+Math.random()+"@gmail.com";
		String username=Email;
		Pageobjectmodelsupplierprofile pom=new Pageobjectmodelsupplierprofile();
		Thread.sleep(100);
		driver.findElement(By.id(pom.signupbutton())).click();
		driver.findElement(By.id(pom.FName1())).sendKeys("Bindu");
		driver.findElement(By.id(pom.LName1())).sendKeys("p");
		driver.findElement(By.name(pom.Email())).sendKeys(username);
		driver.findElement(By.id(pom.typeNumber())).sendKeys("9347820123");
		driver.findElement(By.name(pom.Setpasswaord1())).sendKeys("12345");
		driver.findElement(By.name(pom.Setpasswaord2())).sendKeys("12345");
		Thread.sleep(100);
		driver.findElement(By.xpath(pom.Next1())).click();
		Thread.sleep(100);
		driver.findElement(By.tagName(pom.Next2())).click();
		Thread.sleep(100);
		driver.findElement(By.id(pom.Address())).sendKeys("Vinayaka Nagar");
		driver.findElement(By.id(pom.Address2())).sendKeys("Hafezpet");
		driver.findElement(By.id(pom.City())).sendKeys("Hyderabad");
		driver.findElement(By.id(pom.Pincode())).sendKeys("500045");
		driver.findElement(By.id(pom.State())).sendKeys("Telagana");
		driver.findElement(By.id(pom.Country())).sendKeys("INDIA");
		driver.findElement(By.name(pom.Confirm())).click();
		String real="Role : SUPPLIER";
		Thread.sleep(60);
		String Actual=driver.findElement(By.xpath(pom.actualuser())).getText();
		System.out.println(Actual);
		Assert.assertEquals(Actual, real);
		System.out.println("We sucessfully validated the signup using Supplier ");
		WebElement confirm=driver.findElement(By.xpath(pom.Confirmationtologin()));
		Thread.sleep(100);
		confirm.click();
		Thread.sleep(100);
		driver.findElement(By.xpath(pom.LoginButtonforsupplier())).click();
		driver.manage().timeouts().getImplicitWaitTimeout();
		WebElement username1=driver.findElement(By.xpath(pom.SupplierUsername()));
		username1.clear();
		username1.sendKeys(username);
		driver.findElement(By.xpath(pom.SupplierPassword())).sendKeys("12345");
		driver.findElement(By.xpath(pom.LoginSupplier())).click();
		System.out.println("sucessfully Login into the SUPPLIER profile");
		Thread.sleep(100);
		driver.findElement(By.xpath(pom.AntipyreticClick())).click();
		Thread.sleep(100);
		driver.findElement(By.xpath(pom.Additem())).click();
		System.out.println("Could not add the items to cart in Supplier Profile having message:       ");
		Thread.sleep(60);
		String errormsg=driver.findElement(By.xpath(pom.Errormsg())).getText();
		System.out.println(errormsg);
}
@AfterTest
public void aftertest() {
	System.out.println("Test completed");
	FlushTest();
}
}
