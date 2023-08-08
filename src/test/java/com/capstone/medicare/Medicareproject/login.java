package com.capstone.medicare.Medicareproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	@Test
	public void loginUser() throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8081/medicare/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		String url=driver.getCurrentUrl();
		driver.findElement(By.xpath("//li[@id='signup']")).click();
		//driver.findElement(By.linkText("signup")).click();
		driver.findElement(By.id("firstName")).sendKeys("Bindu");
		driver.findElement(By.id("lastName")).sendKeys("P");
		driver.findElement(By.name("email")).sendKeys("123@gmail.com");
		driver.findElement(By.id("contactNumber")).sendKeys("9347820123");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		driver.findElement(By.className("radio-inline")).click();
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.id("addressLineOne")).sendKeys("Vinayaka Nagar");
		driver.findElement(By.id("addressLineTwo")).sendKeys("Hafezpet");
		driver.findElement(By.id("city")).sendKeys("Hyderabad");
		driver.findElement(By.id("postalCode")).sendKeys(" 500045");
		driver.findElement(By.id("state")).sendKeys(" Telagana");
		driver.findElement(By.id("country")).sendKeys(" INDIA");
		driver.findElement(By.name("_eventId_confirm")).click();
		String real="Role : USER";
		Thread.sleep(60);
		String actualuser=driver.findElement(By.xpath("//h4[3]")).getText();
		System.out.println(actualuser);
		Assert.assertEquals(actualuser, real);
		System.out.println("We sucessfully validated the signup using USER ");
		Thread.sleep(60);
		driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']")).click();
		
		Thread.sleep(60);
		driver.findElement(By.xpath("//a[contains(text(),'Login Here')]")).click();
		driver.findElement(By.name("username")).sendKeys("123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("sucessfully Login into the USER profile");
		Thread.sleep(60);
		driver.findElement(By.id("a_Antipyretics")).click();
		Thread.sleep(60);
		driver.findElement(By.xpath("(//a[@class=\"btn btn-success\"])[1]")).click();
		System.out.println("Single Item successfully added to User cart");
		Thread.sleep(60);
		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
		System.out.println("Validated Checkout of Single item of User Profile");
		driver.navigate().back();
		Thread.sleep(60);
		driver.findElement(By.xpath("//a[contains(text(),'View Products')]")).click();
		Thread.sleep(60);
		driver.findElement(By.id("a_Antibiotics")).click();
		Thread.sleep(60);
		driver.findElement(By.xpath("(//a[@class=\"btn btn-success\"])[1]")).click();
		System.out.println("Multiple Items successfully added to User cart");
		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
		System.out.println("Validated Checkout of Multiple items of User Profile");
		driver.close();
	}
}
