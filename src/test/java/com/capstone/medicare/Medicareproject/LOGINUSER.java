package com.capstone.medicare.Medicareproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LOGINUSER extends ExtentReport{
	private static final WebDriver driver = null;
	@BeforeTest()
public void before() {
		System.out.println("User Profile login Started");
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
	PageobjectModeluserProfile pom=new PageobjectModeluserProfile();
	Thread.sleep(100);
	driver.findElement(By.id(pom.signupbutton())).click();
	driver.findElement(By.id(pom.FName1())).sendKeys("Bindu");
	driver.findElement(By.id(pom.LName1())).sendKeys("p");
	driver.findElement(By.name(pom.Email())).sendKeys(username);
	driver.findElement(By.id(pom.typeNumber())).sendKeys("9347820123");
	driver.findElement(By.name(pom.Setpasswaord1())).sendKeys("12345");
	driver.findElement(By.name(pom.Setpasswaord2())).sendKeys("12345");
	driver.findElement(By.className(pom.Next1())).click();
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
	String real="Role : USER";
	Thread.sleep(100);
	String Actual=driver.findElement(By.xpath(pom.actualuser())).getText();
	System.out.println(Actual);
	Assert.assertEquals(Actual, real);
	System.out.println("We sucessfully validated the signup using USER ");
	Thread.sleep(60);
	driver.findElement(By.xpath(pom.Confirmationtologin())).click();
	Thread.sleep(100);
	driver.findElement(By.xpath(pom.LoginButton())).click();
	driver.findElement(By.name(pom.UserLogin())).sendKeys(username);
	driver.findElement(By.name(pom.PAssworforlogin())).sendKeys("12345");
	driver.findElement(By.xpath(pom.LoginButtonforuser())).click();
	System.out.println("sucessfully Login into the USER profile");
	Thread.sleep(100);
	driver.findElement(By.xpath(pom.Click_Antipyretics())).click();
	Thread.sleep(100);
	driver.findElement(By.xpath(pom.cart_Antipyretics())).click();
	System.out.println("Single Item successfully added to User cart");
	Thread.sleep(100);
	driver.findElement(By.xpath(pom.checkout_Antipyretics())).click();
	System.out.println("Validated Checkout of Single item of User Profile");
	Thread.sleep(100);
	driver.findElement(By.xpath(pom.selectAddress())).click();
	driver.findElement(By.xpath(pom.Cardnumber())).sendKeys("123456789");
	driver.findElement(By.xpath(pom.ExpiryMonth())).sendKeys("09");
	driver.findElement(By.xpath(pom.ExpiryYear())).sendKeys("27");
	driver.findElement(By.xpath(pom.CVVNO())).sendKeys("234");
	driver.findElement(By.xpath(pom.Payment())).click();
	Thread.sleep(60);
	String validate1=driver.findElement(By.xpath(pom.validatepayment())).getText();
	System.out.println("Single item order success has message:  "+validate1);
	driver.findElement(By.xpath(pom.ContinueShopping())).click();
	
	Thread.sleep(100);
	driver.findElement(By.id(pom.Click_Antibiotics())).click();
	Thread.sleep(100);
	driver.findElement(By.xpath(pom.Cart_Antibiotics())).click();
	Thread.sleep(100);
	driver.findElement(By.xpath(pom.backshopping())).click();
	Thread.sleep(100);
	driver.findElement(By.xpath(pom.Cart_anti1())).click();
	System.out.println("Multiple Items successfully added to User cart");
	Thread.sleep(100);
	driver.findElement(By.xpath(pom.Checkout_Antibiotics())).click();
	System.out.println("Validated Checkout of Multiple items of User Profile");
	Thread.sleep(100);
	driver.findElement(By.xpath(pom.selectAddress())).click();
	driver.findElement(By.xpath(pom.Cardnumber())).sendKeys("123456789");
	driver.findElement(By.xpath(pom.ExpiryMonth())).sendKeys("09");
	driver.findElement(By.xpath(pom.ExpiryYear())).sendKeys("27");
	driver.findElement(By.xpath(pom.CVVNO())).sendKeys("234");
	driver.findElement(By.xpath(pom.Payment())).click();
	String validate=driver.findElement(By.xpath(pom.validatepayment())).getText();
	System.out.println("Multiple items successfully orderd has message: 	"+validate);
}
@AfterTest
public void aftertest() {
	System.out.println("Test is Completed");
	FlushTest();
}
}