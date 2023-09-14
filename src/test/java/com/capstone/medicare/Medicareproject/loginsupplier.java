package com.capstone.medicare.Medicareproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginsupplier {
	
	@Test
	public void test2() throws InterruptedException {
		WebDriverManager.chromedriver().setup();;
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8081/medicare/");
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//li[@id='signup']")).click();
		driver.findElement(By.id("firstName")).sendKeys("Bindu");
		driver.findElement(By.id("lastName")).sendKeys("P");
		String Email="bindu"+Math.random()+"@gmail.com";
		String username=Email;
		System.out.println(Email);
		System.out.println(username);
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.id("contactNumber")).sendKeys("9347820223");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("confirmPassword")).sendKeys("123456");
		driver.findElement(By.xpath("(//label[@class='radio-inline'])[2]")).click();
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.id("addressLineOne")).sendKeys("Vinayaka Nagar");
		driver.findElement(By.id("addressLineTwo")).sendKeys("Hafezpet");
		driver.findElement(By.id("city")).sendKeys("Hyderabad");
		driver.findElement(By.id("postalCode")).sendKeys(" 500045");
		driver.findElement(By.id("state")).sendKeys(" Telagana");
		driver.findElement(By.id("country")).sendKeys(" INDIA");
		driver.findElement(By.name("_eventId_confirm")).click();
		String real="Role : SUPPLIER";
		String actualuser=driver.findElement(By.xpath("//h4[3]")).getText();
		System.out.println(actualuser);
		Assert.assertEquals(actualuser, real);
		System.out.println("We sucessfully validated the signup using SUPPLIER ");
		WebElement confirm=driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']"));
		Thread.sleep(100);
		confirm.click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//a[@class=\"btn btn-lg btn-success\"]")).click();
		driver.manage().timeouts().getImplicitWaitTimeout();
		WebElement username1=driver.findElement(By.xpath("//input[@id='username']"));
		username1.clear();
		username1.sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("sucessfully Login into the SUPPLIER profile");
		Thread.sleep(100);
		driver.findElement(By.id("a_Antipyretics")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("(//a[@class=\"btn btn-success\"])[1]")).click();
		System.out.println("Could not add the items to cart in Supplier Profile having message:       ");
		Thread.sleep(60);
		String errormsg=driver.findElement(By.xpath("//blockquote[@style=\"word-wrap:break-word\"]")).getText();
		System.out.print(errormsg);	
	}	
	
}
